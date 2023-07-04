class SpelReproTests {
  @Test
  public void SPR9486_floatEqFloat() {
    Boolean expectedResult = 10.215f == 10.2f;
    ExpressionParser parser = new SpelExpressionParser();
    StandardEvaluationContext context = new StandardEvaluationContext();
    Expression expression = parser.parseExpression("10.215f==10.2f");
    Boolean result = expression.getValue(context, null, Boolean.class);
    assertThat(result).isEqualTo(expectedResult);
  }
}
