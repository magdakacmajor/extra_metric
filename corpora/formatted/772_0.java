class WebSphereUowTransactionManagerTests {
  @Test
  public void newTransactionWithCommitUsingPropagationRequiresNew() {
    doTestNewTransactionWithCommit(
        TransactionDefinition.PROPAGATION_REQUIRES_NEW,
        WebSphereUowTransactionManager.SYNCHRONIZATION_ALWAYS);
  }
}
