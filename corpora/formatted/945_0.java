class DataBufferDecoderTests {
  @Test
  public void decode() {
    Flux<DataBuffer> input = Flux.concat(dataBuffer("data1"));
    testDecodeAll(input, DataBufferLimitException.class);
  }
}
