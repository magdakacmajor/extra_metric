class SpelParserTests {
  @Test
  public void testStringLiterals_DoubleQuotes_spr9620_2() {
    SpelExpression expr = new SpelExpressionParser().parseRaw("\"double quote:\"\".\"");
    assertThat(expr.getValue()).isEqualTo("double quote:\".");
    expr = new SpelExpressionParser().parseRaw("\"hello\"\"world\"");
    assertThat(expr.getValue()).isEqualTo("hello\"world");
  }
}
