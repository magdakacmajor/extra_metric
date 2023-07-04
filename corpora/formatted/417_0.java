class DataSourceJtaTransactionTests {
  @Test
  public void
      testJtaTransactionCommitWithPropagationRequiresNewWithOpenOuterConnectionAndBeginException()
          throws Exception {
    doTestJtaTransactionWithPropagationRequiresNewAndBeginException(false, true, false);
  }
}
