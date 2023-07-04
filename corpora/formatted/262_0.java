class WebSphereUowTransactionManagerTests {
  @Test
  public void newTransactionSynchronizationUsingPropagationNeverAndSynchOnActual() {
    doTestNewTransactionSynchronization(
        TransactionDefinition.PROPAGATION_NEVER,
        WebSphereUowTransactionManager.SYNCHRONIZATION_ON_ACTUAL_TRANSACTION);
  }
}
