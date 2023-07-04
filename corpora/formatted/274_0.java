class SpelExceptionTests {
  @Test
  public void spelExpressionArrayIndexAccessNullVariables() {
    ExpressionParser parser = new SpelExpressionParser();
    Expression spelExpression = parser.parseExpression("#anArray[0]eq 1");
    assertThatExceptionOfType(SpelEvaluationException.class).isThrownBy(spelExpression::getValue);
  }
}
