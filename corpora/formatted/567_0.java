class EvaluationTests {
  @Test
  public void testRelOperatorsInstanceof01() {
    evaluate("null instanceof T(Integer)", "false", Boolean.class);
  }
}
