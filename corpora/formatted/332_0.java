class JCacheKeyGeneratorTests {
  @Test
  public void getFlattenVararg() {
    this.keyGenerator.expect(1L);
    Object first = this.simpleService.get(1L);
    Object second = this.simpleService.get(1L);
    assertThat(second).isSameAs(first);
    Object key = new SimpleKey(1L);
    assertThat(cache.get(key).get()).isEqualTo(first);
  }
}
