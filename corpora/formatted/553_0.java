class DataSourceTransactionManagerTests {
  @Test
  public void testTransactionRollbackWithAutoCommitFalseAndLazyConnection() throws Exception {
    doTestTransactionRollbackRestoringAutoCommit(false, true, false);
  }
}
