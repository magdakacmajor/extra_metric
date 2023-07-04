class EvaluationTests {
  @Test
  public void testRelOperatorsMatches02() {
    evaluate("27 matches'^.*2.*$'", true, Boolean.class);
  }
}
