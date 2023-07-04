class SpelParserTests {
  @Test
  public void arithmeticPrecedence6() {
    SpelExpression expr = new SpelExpressionParser().parseRaw("10/2+3");
    assertThat(expr.getValue()).isEqualTo(8);
  }
}
