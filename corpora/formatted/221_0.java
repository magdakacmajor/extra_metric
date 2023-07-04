class SpelParserTests {
  @Test
  public void arithmeticPrecedence5() {
    SpelExpressionParser parser = new SpelExpressionParser();
    SpelExpression expr = parser.parseRaw("2+2");
    assertThat(expr.getValue()).isEqualTo(8);
  }
}
