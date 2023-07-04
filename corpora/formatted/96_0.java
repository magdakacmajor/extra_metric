class AspectJEnableCachingIsolatedTests {
  @Test
  public void multipleCacheManagerBeans() {
    try {
      load(MultiCacheManagerConfig.class);
    } catch (IllegalStateException ex) {
      assertThat(ex.getMessage().contains("no unique bean of type CacheManager")).isTrue();
    }
  }
}
