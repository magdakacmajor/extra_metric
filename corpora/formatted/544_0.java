class SpelReproTests {
  @Test
  public void SPR9486_subtractFloatWithFloat() {
    Number expectedNumber = 10.21f + 10.2f;
    ExpressionParser parser = new SpelExpressionParser();
    StandardEvaluationContext context = new StandardEvaluationContext();
    Expression expression = parser.parseExpression("10.21f+10.2f");
    Number result = expression.getValue(context, null, Number.class);
    assertThat(result).isEqualTo(expectedNumber);
  }
}
