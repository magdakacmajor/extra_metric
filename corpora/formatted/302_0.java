class ReactiveTransactionSupportTests {
  @Test
  public void commitWithoutExistingTransaction() {
    ReactiveTestTransactionManager tm = new ReactiveTestTransactionManager(false, true);
    tm.getReactiveTransaction(new DefaultTransactionDefinition())
        .flatMap(tm::commit)
        .subscriberContext(TransactionContextManager.createTransactionContext())
        .as(StepVerifier::create)
        .verifyComplete();
    assertHasNotBegan(tm);
    assertHasNotCommitted(tm);
    assertHasNoRollback(tm);
    assertHasNotSetRollbackOnly(tm);
    assertHasNotCleanedUp(tm);
  }
}
