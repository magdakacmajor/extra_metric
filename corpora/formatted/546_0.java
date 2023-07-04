class WebSphereUowTransactionManagerTests {
  @Test
  public void existingTransactionWithParticipationUsingPropagationSupports() {
    doTestExistingTransactionWithParticipation(TransactionDefinition.PROPAGATION_SUPPORTS);
  }
}
