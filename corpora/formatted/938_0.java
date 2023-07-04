class SelectionAndProjectionTests {
  @Test
  public void selectFirstItemInPrimitiveArray() throws Exception {
    Expression expression = new SpelExpressionParser().parseRaw("ints.^[#this<5]");
    EvaluationContext context = new StandardEvaluationContext(new ArrayTestBean());
    Object value = expression.getValue(context);
    boolean condition = value instanceof Integer;
    assertThat(condition).isTrue();
    assertThat(value).isEqualTo(0);
  }
}
