class SelectionAndProjectionTests {
  @Test
  public void selectFirstItemInSet() throws Exception {
    Expression expression = new SpelExpressionParser().parseRaw("integers.^[#this<5]");
    EvaluationContext context = new StandardEvaluationContext(new SetTestBean());
    Object value = expression.getValue(context);
    boolean condition = value instanceof Integer;
    assertThat(condition).isTrue();
    assertThat(value).isEqualTo(0);
  }
}
