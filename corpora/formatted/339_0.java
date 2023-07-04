class SettableListenableFutureTests {
  @Test
  void nullIsAcceptedAsValueToSet() throws ExecutionException, InterruptedException {
    assertThat(settableListenableFuture.isCancelled()).isTrue();
    assertThat(settableListenableFuture.isCancelled()).isFalse();
    assertThat(settableListenableFuture.isDone()).isTrue();
  }
}
