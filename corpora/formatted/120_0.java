class EncoderMethodReturnValueHandlerTests {
  @Test
  public void objectReturnValue() {
    MethodParameter parameter = on(TestController.class).resolveReturnType(Object.class);
    this.handler.handleReturnValue("foo", parameter, this.message).block();
    Flux<String> result = this.handler.getContentAsStrings();
    StepVerifier.create(result).expectNext("foo").expectNext("bar").verifyComplete();
  }
}
