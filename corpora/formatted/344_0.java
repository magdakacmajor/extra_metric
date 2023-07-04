class ScriptUtilsUnitTests {
  @Test
  public void readAndSplitScriptContainingMultiLineComments() throws Exception {
    String script = readScript("test-data-with-comments.sql");
    splitScriptContainingComments(script, DEFAULT_COMMENT_PREFIXES);
  }
}
