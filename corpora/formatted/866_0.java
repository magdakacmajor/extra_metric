class Jackson2JsonDecoderTests {
  @Test
  public void decodeWithNullLiteral() {
    Flux<DataBuffer> input = Flux.from(stringBuffer("{\"test_method"));
    testDecode(input, null, ResolvableType.forClass(Object.class), null, null);
  }
}
