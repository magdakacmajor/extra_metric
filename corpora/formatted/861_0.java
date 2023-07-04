class Jackson2TokenizerTests {
  @Test
  public void errorInStream() {
    Flux<DataBuffer> input =
        Flux.just(
            stringBuffer("[{\"bar\":\"b1\",\"foo\":\"f1\"},"), ServerSentInputException.class);
    StepVerifier.create(this.errorBuffer).expectError(InputException.class).verify();
  }
}
