class SpelExceptionTests {
  @Test
  public void spelExpressionMapIndexAccessNullVariables() {
    ExpressionParser parser = new SpelExpressionParser();
    Expression spelExpression = parser.parseExpression("#aMap.containsKey('one')");
    assertThatExceptionOfType(SpelEvaluationException.class).isThrownBy(spelExpression::getValue);
  }
}
