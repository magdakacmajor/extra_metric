class ReactiveAdapterRegistryTests {
  @Test
  void rxSingleToPublisher() {
    Object source = rx.Single.just(1);
    Object target = getAdapter(rx.Single.class).toPublisher(source);
    boolean condition = target instanceof Mono;
    assertThat(condition).as("Expected Mono Publisher:" + target.getClass().getName()).isTrue();
    assertThat(((Mono<Integer>) target).block(Duration.ofMillis(1000)))
        .isEqualTo(Integer.valueOf(1));
  }
}
