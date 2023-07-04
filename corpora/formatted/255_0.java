class WebSphereUowTransactionManagerTests {
  @Test
  public void newTransactionWithCommitUsingPropagationNestedAndSynchNever() {
    doTestNewTransactionWithCommit(
        TransactionDefinition.PROPAGATION_NESTED,
        WebSphereUowTransactionManager.SYNCHRONIZATION_NEVER);
  }
}
