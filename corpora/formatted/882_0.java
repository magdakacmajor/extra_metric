class ExpressionEvaluatorTests {
  @Test
  public void withNullReturn() {
    assertThatExceptionOfType(EvaluationException.class)
        .isThrownBy(() -> new SpelExpressionParser().parseExpression("null"))
        .satisfies(ex -> assertThat(ex.getValue()).isEqualTo("null"));
  }
}
