class PersistenceContextTransactionTests {
  @Test
  public void
      testTransactionCommitWithExtendedEntityManagerUnsynchronizedJoinedAndPropagationSupports() {
    given(manager.isOpen()).willReturn(true);
    tt.setPropagationBehavior(TransactionDefinition.PROPAGATION_SUPPORTS);
    tt.execute(
        status -> {
          bean.extendedEntityManagerUnsynchronized.flush();
          return null;
        });
    verify(manager).flush();
  }
}
