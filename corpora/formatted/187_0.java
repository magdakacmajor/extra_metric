class SpelReproTests {
  @Test
  public void SPR9486_subtractFloatWithDouble() {
    Number expectedNumber = 10.21f + 10.2;
    ExpressionParser parser = new SpelExpressionParser();
    StandardEvaluationContext context = new StandardEvaluationContext();
    Expression expression = parser.parseExpression("10.21f+10.2");
    Number result = expression.getValue(context, null, Number.class);
    assertThat(result).isEqualTo(expectedResult);
  }
}
