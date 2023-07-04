class JdbcNamespaceIntegrationTests {
  @Test
  public void createWithEndings() throws Exception {
    assertCorrectSetupAndCloseContext("jdbc-initialize-endings-nested-config.xml", 2, "dataSource");
  }
}
