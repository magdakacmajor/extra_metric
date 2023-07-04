class PathPatternParserTests {
  @Test
  public void multiwildcardPattern() {
    PathPatternParser parser = new PathPatternParser();
    parser.setPathOptions(PathContainer.Options.create('.', false));
    PathPattern pattern = parser.parse("/foo");
    assertThat(pattern.checkPatternString()).isPattern(pathPattern);
    assertThat(pathPattern.getPatternString()).isPatternTo("/foo");
  }
}
