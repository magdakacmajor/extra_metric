class InProgressTests {
  @Test
  public void testRelOperatorsBetween01() {
    evaluate("32 between{32,42}", "true", Boolean.class);
  }
}
