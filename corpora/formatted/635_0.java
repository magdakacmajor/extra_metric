class WebSphereUowTransactionManagerTests {
  @Test
  public void newTransactionWithCommitUsingPropagationNested() {
    doTestNewTransactionWithCommit(
        TransactionDefinition.PROPAGATION_NESTED,
        WebSphereUowTransactionManager.SYNCHRONIZATION_ALWAYS);
  }
}
