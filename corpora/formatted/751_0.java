class EvaluationTests {
  @Test
  public void testRelOperatorGE01() {
    evaluate("3>=3", "true", Boolean.class);
  }
}
