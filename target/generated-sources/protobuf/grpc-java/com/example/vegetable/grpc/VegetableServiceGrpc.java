package com.example.vegetable.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: vegetable.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VegetableServiceGrpc {

  private VegetableServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vegetable.VegetableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest,
      com.example.vegetable.grpc.VegetableResponse> getGetVegetableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVegetable",
      requestType = com.example.vegetable.grpc.VegetableRequest.class,
      responseType = com.example.vegetable.grpc.VegetableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest,
      com.example.vegetable.grpc.VegetableResponse> getGetVegetableMethod() {
    io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest, com.example.vegetable.grpc.VegetableResponse> getGetVegetableMethod;
    if ((getGetVegetableMethod = VegetableServiceGrpc.getGetVegetableMethod) == null) {
      synchronized (VegetableServiceGrpc.class) {
        if ((getGetVegetableMethod = VegetableServiceGrpc.getGetVegetableMethod) == null) {
          VegetableServiceGrpc.getGetVegetableMethod = getGetVegetableMethod =
              io.grpc.MethodDescriptor.<com.example.vegetable.grpc.VegetableRequest, com.example.vegetable.grpc.VegetableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVegetable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.vegetable.grpc.VegetableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.vegetable.grpc.VegetableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VegetableServiceMethodDescriptorSupplier("GetVegetable"))
              .build();
        }
      }
    }
    return getGetVegetableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest,
      com.example.vegetable.grpc.VegetableResponse> getCreateVegetableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVegetable",
      requestType = com.example.vegetable.grpc.VegetableRequest.class,
      responseType = com.example.vegetable.grpc.VegetableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest,
      com.example.vegetable.grpc.VegetableResponse> getCreateVegetableMethod() {
    io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest, com.example.vegetable.grpc.VegetableResponse> getCreateVegetableMethod;
    if ((getCreateVegetableMethod = VegetableServiceGrpc.getCreateVegetableMethod) == null) {
      synchronized (VegetableServiceGrpc.class) {
        if ((getCreateVegetableMethod = VegetableServiceGrpc.getCreateVegetableMethod) == null) {
          VegetableServiceGrpc.getCreateVegetableMethod = getCreateVegetableMethod =
              io.grpc.MethodDescriptor.<com.example.vegetable.grpc.VegetableRequest, com.example.vegetable.grpc.VegetableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVegetable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.vegetable.grpc.VegetableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.vegetable.grpc.VegetableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VegetableServiceMethodDescriptorSupplier("CreateVegetable"))
              .build();
        }
      }
    }
    return getCreateVegetableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest,
      com.example.vegetable.grpc.VegetableResponse> getStreamVegetablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamVegetables",
      requestType = com.example.vegetable.grpc.VegetableRequest.class,
      responseType = com.example.vegetable.grpc.VegetableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest,
      com.example.vegetable.grpc.VegetableResponse> getStreamVegetablesMethod() {
    io.grpc.MethodDescriptor<com.example.vegetable.grpc.VegetableRequest, com.example.vegetable.grpc.VegetableResponse> getStreamVegetablesMethod;
    if ((getStreamVegetablesMethod = VegetableServiceGrpc.getStreamVegetablesMethod) == null) {
      synchronized (VegetableServiceGrpc.class) {
        if ((getStreamVegetablesMethod = VegetableServiceGrpc.getStreamVegetablesMethod) == null) {
          VegetableServiceGrpc.getStreamVegetablesMethod = getStreamVegetablesMethod =
              io.grpc.MethodDescriptor.<com.example.vegetable.grpc.VegetableRequest, com.example.vegetable.grpc.VegetableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamVegetables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.vegetable.grpc.VegetableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.vegetable.grpc.VegetableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VegetableServiceMethodDescriptorSupplier("StreamVegetables"))
              .build();
        }
      }
    }
    return getStreamVegetablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VegetableServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegetableServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegetableServiceStub>() {
        @java.lang.Override
        public VegetableServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegetableServiceStub(channel, callOptions);
        }
      };
    return VegetableServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VegetableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegetableServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegetableServiceBlockingStub>() {
        @java.lang.Override
        public VegetableServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegetableServiceBlockingStub(channel, callOptions);
        }
      };
    return VegetableServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VegetableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VegetableServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VegetableServiceFutureStub>() {
        @java.lang.Override
        public VegetableServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VegetableServiceFutureStub(channel, callOptions);
        }
      };
    return VegetableServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getVegetable(com.example.vegetable.grpc.VegetableRequest request,
        io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVegetableMethod(), responseObserver);
    }

    /**
     */
    default void createVegetable(com.example.vegetable.grpc.VegetableRequest request,
        io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVegetableMethod(), responseObserver);
    }

    /**
     */
    default void streamVegetables(com.example.vegetable.grpc.VegetableRequest request,
        io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamVegetablesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VegetableService.
   */
  public static abstract class VegetableServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VegetableServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VegetableService.
   */
  public static final class VegetableServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VegetableServiceStub> {
    private VegetableServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegetableServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegetableServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVegetable(com.example.vegetable.grpc.VegetableRequest request,
        io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVegetableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVegetable(com.example.vegetable.grpc.VegetableRequest request,
        io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVegetableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamVegetables(com.example.vegetable.grpc.VegetableRequest request,
        io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamVegetablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VegetableService.
   */
  public static final class VegetableServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VegetableServiceBlockingStub> {
    private VegetableServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegetableServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegetableServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.vegetable.grpc.VegetableResponse getVegetable(com.example.vegetable.grpc.VegetableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVegetableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.vegetable.grpc.VegetableResponse createVegetable(com.example.vegetable.grpc.VegetableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVegetableMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.vegetable.grpc.VegetableResponse> streamVegetables(
        com.example.vegetable.grpc.VegetableRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamVegetablesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VegetableService.
   */
  public static final class VegetableServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VegetableServiceFutureStub> {
    private VegetableServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VegetableServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VegetableServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.vegetable.grpc.VegetableResponse> getVegetable(
        com.example.vegetable.grpc.VegetableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVegetableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.vegetable.grpc.VegetableResponse> createVegetable(
        com.example.vegetable.grpc.VegetableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVegetableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEGETABLE = 0;
  private static final int METHODID_CREATE_VEGETABLE = 1;
  private static final int METHODID_STREAM_VEGETABLES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEGETABLE:
          serviceImpl.getVegetable((com.example.vegetable.grpc.VegetableRequest) request,
              (io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse>) responseObserver);
          break;
        case METHODID_CREATE_VEGETABLE:
          serviceImpl.createVegetable((com.example.vegetable.grpc.VegetableRequest) request,
              (io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse>) responseObserver);
          break;
        case METHODID_STREAM_VEGETABLES:
          serviceImpl.streamVegetables((com.example.vegetable.grpc.VegetableRequest) request,
              (io.grpc.stub.StreamObserver<com.example.vegetable.grpc.VegetableResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetVegetableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.vegetable.grpc.VegetableRequest,
              com.example.vegetable.grpc.VegetableResponse>(
                service, METHODID_GET_VEGETABLE)))
        .addMethod(
          getCreateVegetableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.vegetable.grpc.VegetableRequest,
              com.example.vegetable.grpc.VegetableResponse>(
                service, METHODID_CREATE_VEGETABLE)))
        .addMethod(
          getStreamVegetablesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.vegetable.grpc.VegetableRequest,
              com.example.vegetable.grpc.VegetableResponse>(
                service, METHODID_STREAM_VEGETABLES)))
        .build();
  }

  private static abstract class VegetableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VegetableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.vegetable.grpc.Vegetable.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VegetableService");
    }
  }

  private static final class VegetableServiceFileDescriptorSupplier
      extends VegetableServiceBaseDescriptorSupplier {
    VegetableServiceFileDescriptorSupplier() {}
  }

  private static final class VegetableServiceMethodDescriptorSupplier
      extends VegetableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VegetableServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VegetableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VegetableServiceFileDescriptorSupplier())
              .addMethod(getGetVegetableMethod())
              .addMethod(getCreateVegetableMethod())
              .addMethod(getStreamVegetablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
