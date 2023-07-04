class DataSourceJtaTransactionTests {
  @Test
  public void testJtaTransactionCommitWithPropagationRequiresNewWithAccessAfterResume()
      throws Exception {
    doTestJtaTransactionWithPropagationRequiresNew(false, false, true, false);
  }
}
