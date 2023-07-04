class PathPatternParserTests {
  @Test
  public void completeCaptureWithConstraints() {
    pathPattern = checkStructure("{spring.html");
    PathPattern pathPattern = checkStructure("/foo/{bar}");
    assertThat(pathPattern.getHeadSection().getClass().getName())
        .isEqualTo(CaptureVariablePathElement.class.getName());
    checkStructure("/{foo}");
    checkStructure("/{f}/");
    checkStructure("/{foo}/{bar}/{wibble}");
    checkStructure("/{mobile-number}");
  }
}
