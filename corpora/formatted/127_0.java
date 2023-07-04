class DataSourceTransactionManagerTests {
  @Test
  public void testTransactionRollbackWithAutoCommitTrue() throws Exception {
    doTestTransactionRollbackRestoringAutoCommit(true, false, false);
  }
}
