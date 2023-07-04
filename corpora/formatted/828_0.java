class SpelReproTests {
  @Test
  public void SPR10091_primitiveTestValue() {
    ExpressionParser parser = new SpelExpressionParser();
    StandardEvaluationContext evaluationContext =
        new StandardEvaluationContext(new BooleanHolder());
    Class<?> valueType =
        parser.parseExpression("primitiveProperty").getValueType(evaluationContext);
    assertThat(valueType).isEqualTo(Boolean.class);
  }
}
