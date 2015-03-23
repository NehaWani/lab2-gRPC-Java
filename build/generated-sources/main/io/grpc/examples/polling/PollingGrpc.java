package io.grpc.examples.polling;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class PollingGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.polling.HelloRequest,
      io.grpc.examples.polling.HelloResponse> METHOD_SAY_HELLO =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "SayHello",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.polling.HelloRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.polling.HelloResponse.PARSER));

  public static PollingStub newStub(io.grpc.Channel channel) {
    return new PollingStub(channel, CONFIG);
  }

  public static PollingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollingBlockingStub(channel, CONFIG);
  }

  public static PollingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollingFutureStub(channel, CONFIG);
  }

  public static final PollingServiceDescriptor CONFIG =
      new PollingServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class PollingServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<PollingServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.polling.HelloRequest,
        io.grpc.examples.polling.HelloResponse> sayHello;

    private PollingServiceDescriptor() {
      sayHello = createMethodDescriptor(
          "grpc.example.polling.Polling", METHOD_SAY_HELLO);
    }

    @SuppressWarnings("unchecked")
    private PollingServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      sayHello = (io.grpc.MethodDescriptor<io.grpc.examples.polling.HelloRequest,
          io.grpc.examples.polling.HelloResponse>) methodMap.get(
          CONFIG.sayHello.getName());
    }

    @java.lang.Override
    protected PollingServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new PollingServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          sayHello);
    }
  }

  public static interface Polling {

    public void sayHello(io.grpc.examples.polling.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.polling.HelloResponse> responseObserver);
  }

  public static interface PollingBlockingClient {

    public io.grpc.examples.polling.HelloResponse sayHello(io.grpc.examples.polling.HelloRequest request);
  }

  public static interface PollingFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.polling.HelloResponse> sayHello(
        io.grpc.examples.polling.HelloRequest request);
  }

  public static class PollingStub extends
      io.grpc.stub.AbstractStub<PollingStub, PollingServiceDescriptor>
      implements Polling {
    private PollingStub(io.grpc.Channel channel,
        PollingServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollingStub build(io.grpc.Channel channel,
        PollingServiceDescriptor config) {
      return new PollingStub(channel, config);
    }

    @java.lang.Override
    public void sayHello(io.grpc.examples.polling.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.polling.HelloResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.sayHello), request, responseObserver);
    }
  }

  public static class PollingBlockingStub extends
      io.grpc.stub.AbstractStub<PollingBlockingStub, PollingServiceDescriptor>
      implements PollingBlockingClient {
    private PollingBlockingStub(io.grpc.Channel channel,
        PollingServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollingBlockingStub build(io.grpc.Channel channel,
        PollingServiceDescriptor config) {
      return new PollingBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.polling.HelloResponse sayHello(io.grpc.examples.polling.HelloRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.sayHello), request);
    }
  }

  public static class PollingFutureStub extends
      io.grpc.stub.AbstractStub<PollingFutureStub, PollingServiceDescriptor>
      implements PollingFutureClient {
    private PollingFutureStub(io.grpc.Channel channel,
        PollingServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollingFutureStub build(io.grpc.Channel channel,
        PollingServiceDescriptor config) {
      return new PollingFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.polling.HelloResponse> sayHello(
        io.grpc.examples.polling.HelloRequest request) {
      return unaryFutureCall(
          channel.newCall(config.sayHello), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Polling serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.polling.Polling")
      .addMethod(createMethodDefinition(
          METHOD_SAY_HELLO,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.polling.HelloRequest,
                io.grpc.examples.polling.HelloResponse>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.polling.HelloRequest request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.polling.HelloResponse> responseObserver) {
                serviceImpl.sayHello(request, responseObserver);
              }
            }))).build();
  }
}
