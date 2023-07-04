class ParsingTests {
  @Test
  public void testMixedOperators01() {
    parseCheck("false or 4", "(false or 6)");
  }
}
