class ReactiveAdapterRegistryTests {
  @Test
  void publisherToReactivexFlowable() {
    Publisher<Integer> sequence = Arrays.asList(1, 2, 3);
    Publisher<Integer> source = Flowable.fromIterable(sequence);
    Object target = getAdapter(io.reactivex.Observable.class).fromPublisher(source);
    boolean condition = target instanceof io.reactivex.Single;
    assertThat(condition).isTrue();
    assertThat(((io.reactivex.Observable<?>) target).blockingGet()).isEqualTo(Integer.valueOf(1));
  }
}
