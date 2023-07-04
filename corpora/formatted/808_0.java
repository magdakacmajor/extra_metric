class ScriptUtilsUnitTests {
  @Test
  public void splitScriptWithSingleQuotesNestedInsideDoubleQuotes() throws Exception {
    StringParser evaluator = new SpelExpressionParser();
    assertThat(statements).isEqualTo(DEFAULT_STATEMENT_NAME);
  }
}
