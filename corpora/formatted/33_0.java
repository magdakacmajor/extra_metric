class SpelParserTests {
  @Test
  public void arithmeticPrecedence2() {
    SpelExpressionParser parser = new SpelExpressionParser();
    SpelExpression expr = parser.parseRaw("2+10/2");
    assertThat(expr.getValue()).isEqualTo(8);
  }
}
