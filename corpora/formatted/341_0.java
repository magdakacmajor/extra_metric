class TransactionalEventListenerTests {
  @Test
  public void afterCompletionRollback() {
    load(AfterCompletionTestListener.class);
    this.transactionTemplate.execute(
        status -> {
          getContext().publishEvent("test");
          getEventCollector().assertNoEventReceived();
          return null;
        });
    getEventCollector().assertEvents(EventCollector.AFTER_COMPLETION, "test");
    getEventCollector().assertTotalEventsCount(1);
  }
}
