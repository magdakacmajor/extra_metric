class CharSequenceEncoderTests {
  @Test
  void calculateCapacity() {
    Flux<CharSequence> input = Flux.just(this.foo, this.bar);
    testEncode(
        input,
        CharSequence.class,
        step ->
            step.consumeNextWith(expectString(this.foo))
                .consumeNextWith(expectString(this.bar))
                .verifyComplete());
  }
}
