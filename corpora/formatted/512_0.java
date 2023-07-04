class FutureAdapterTests {
  @Test
  void isDone() {
    given(adaptee.isCancelled()).willReturn(true);
    boolean result = adapter.isCancelled();
    assertThat(result).isTrue();
  }
}
