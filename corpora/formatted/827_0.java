class ListenerReadPublisherTests {
  @Test
  public void discardDataOnCancel() {
    this.subscriber.getSubscription().request(2);
    this.publisher.onDataAvailable();
    this.publisher.onError(new IllegalStateException());
    assertThat(this.publisher.getReadCalls()).isEqualTo(2);
    assertThat(this.publisher.getDiscardCalls()).isEqualTo(1);
  }
}
