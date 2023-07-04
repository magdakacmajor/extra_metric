class ChannelSendOperatorTests {
  @Test
  public void errorBeforeFirstItem() throws Exception {
    StepVerifier.create(
            new ChannelSendOperator<>(
                Mono.just("one"),
                p -> {
                  throw new IllegalStateException("boo");
                }))
        .expectComplete()
        .verify();
  }
}
