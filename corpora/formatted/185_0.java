class TemplateExpressionParsingTests {
  @Test
  public void testParsingSimpleTemplateExpression03() throws Exception {
    SpelExpressionParser parser = new SpelExpressionParser();
    Expression expr = parser.parseExpression("hello${'world'}", DEFAULT_TEMPLATE_PARSER_CONTEXT);
    Object o = expr.getValue();
    assertThat(o.toString()).isEqualTo("hello to you");
  }
}
