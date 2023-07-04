class ScriptUtilsUnitTests {
  @Test
  public void readAndSplitScriptContainingMultiLineNestedComments() throws Exception {
    String script = readScript("test-data-with-multi-prefix-comments.sql");
    splitScriptContainingComments(script, DEFAULT_COMMENT_PREFIXES);
  }
}
