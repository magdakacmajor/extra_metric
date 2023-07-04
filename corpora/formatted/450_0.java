class DataSourceTransactionManagerTests {
  @Test
  public void testTransactionCommitWithAutoCommitTrueAndLazyConnectionAndStatementCreated()
      throws Exception {
    doTestTransactionCommitRestoringAutoCommit(true, true, true);
  }
}
