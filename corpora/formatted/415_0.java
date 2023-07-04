class EvaluationTests {
  @Test
  public void testMixingOperators01() {
    evaluate("false>6", "false", Boolean.class);
  }
}
