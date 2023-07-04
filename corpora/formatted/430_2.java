class CacheSyncFailureTests {
  @Test
  public void unlessSync() {
    assertThatIllegalStateException()
        .isThrownBy(() -> this.simpleService.syncWithAnotherOperation("key"))
        .withMessageContaining(
            "@Cacheable(sync=true) cannot be combined with other cache operations");
  }
}
