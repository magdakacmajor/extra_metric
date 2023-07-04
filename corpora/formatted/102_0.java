class PayloadMethodArgumentResolverTests {
  @Test
  public void validateStringMono() {
    String body = "foo";
    MethodParameter param = this.testMethod.annotNotPresent(Payload.class).arg(String.class);
    Mono<Object> mono =
        resolveValue(
            param, Mono.delay(Duration.ofMillis(10)).map(aLong -> toDataBuffer(body)), null);
    assertThat(mono.block()).isEqualTo(body);
  }
}
