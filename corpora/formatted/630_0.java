class TransactionalEventListenerTests {
  @Test
  public void transactionDemarcationWithSupportsPropagationAndNoTransaction() {
    load(BeforeCommitTestListener.class, AfterCompletionTestListener.class);
    this.transactionTemplate.execute(
        status -> {
          getContext().getBean(TestBean.class).supports();
          getEventCollector().assertNoEventReceived();
          return null;
        });
    getEventCollector().assertTotalEventsCount(2);
  }
}
