class ReactiveAdapterRegistryTests {
  @Test
  void publisherToCompletableFuture() throws Exception {
    Publisher<Integer> source = Flowable.fromArray(1, 2, 3);
    Object target = getAdapter(rx.Completable.class).fromPublisher(source);
    boolean condition = target instanceof Completable;
    assertThat(condition).isTrue();
    assertThat(((Completable) target).get()).isNull();
  }
}
