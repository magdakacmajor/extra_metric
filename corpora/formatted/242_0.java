class ParsingTests {
  @Test
  public void testRelOperatorsMatches02() {
    parseCheck("'5.0067'matches'^-?\\d+(\\.\\d{2})?$'", "('5.0067'matches'^-?\\d+(\\.\\d{2})?$')");
  }
}
