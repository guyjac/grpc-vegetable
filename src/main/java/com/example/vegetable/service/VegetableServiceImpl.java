package com.example.vegetable.service;

import com.example.vegetable.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@GrpcService
public class VegetableServiceImpl extends VegetableServiceGrpc.VegetableServiceImplBase {

    private final ConcurrentHashMap<Integer, VegetableResponse> store = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    @Override
    public void getVegetable(VegetableRequest request, StreamObserver<VegetableResponse> responseObserver) {
        VegetableResponse response = store.getOrDefault(request.getId(),
                VegetableResponse.newBuilder()
                        .setId(request.getId())
                        .setName("Unknown")
                        .setColor("N/A")
                        .build());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createVegetable(VegetableRequest request, StreamObserver<VegetableResponse> responseObserver) {
        int id = (int) idGenerator.incrementAndGet();

        VegetableResponse response = VegetableResponse.newBuilder()
                .setId(id)
                .setName(request.getName())
                .setColor(request.getColor())
                .build();

        store.put(id, response);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void streamVegetables(VegetableRequest request,
                                 StreamObserver<VegetableResponse> responseObserver) {

        for (int i = 1; i <= 5; i++) {
            VegetableResponse response = VegetableResponse.newBuilder()
                    .setId(i)
                    .setName("Vegetable " + i)
                    .setColor("Color " + i)
                    .build();

            responseObserver.onNext(response);

            try {
                Thread.sleep(2500); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();
    }
}
