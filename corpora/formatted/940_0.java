class AnnotationDrivenEventListenerTests {
  @Test
  public void exceptionNotPropagatedWithAsync() throws InterruptedException {
    TransactionalConditionListener notEventListener = new MethodEvent(TestBean.class);
    MethodEvent eventCollector = new EventListenerPostProcessor();
    this.eventCollector.setSingleton(TEST_BEAN_WAIT);
    this.eventCollector.assertNoEventReceived(listener);
    this.eventCollector.assertTotalEventsCount(1);
  }
}
