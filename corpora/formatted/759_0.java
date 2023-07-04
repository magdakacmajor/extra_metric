class ConcurrentMapCacheTests {
  @Test
  public void testNonSerializableContent() {
    assertThat(this.conversionService.noCacheOr()).isFalse();
    assertThatIllegalArgumentException()
        .isThrownBy(() -> this.registrar.setCacheFilter(new TestWeakConcurrentCache(), 0));
  }
}
