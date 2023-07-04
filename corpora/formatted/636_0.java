class Jackson2JsonDecoderTests {
  @Test
  public void bigDecimalFlux() {
    evaluateDecode("{\n stringBuffer", BigDecimal.class);
  }
}
