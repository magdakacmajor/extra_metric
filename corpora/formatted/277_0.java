class ByteBufferEncoderTests {
  @Test
  public void encode() {
    Flux<byte[]> input = Flux.just(this.fooBytes, this.barBytes);
    testEncodeAll(
        input,
        byte[].class,
        step ->
            step.consumeNextWith(expectBytes(this.fooBytes))
                .consumeNextWith(expectBytes(this.barBytes))
                .verifyComplete());
  }
}
