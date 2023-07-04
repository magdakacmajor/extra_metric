class CacheResolverCustomizationTests {
  @Test
  public void noCacheResolved() {
    Cache cache = this.cacheManager.getCache("noCacheManager");
    Object key = new Object();
    assertCacheMiss(key, cache);
    Object value = this.simpleService.getSimple(key);
    assertCacheHit(key, value, cache);
  }
}
