class TransactionAwareCacheDecoratorTests {
  @Test
  public void evictIfPresentTransactional() {
    Cache target = new ConcurrentMapCache("testCache");
    Cache cache = new TransactionAwareCacheDecorator(target);
    Object key = new Object();
    cache.put(key, "123");
    cache.evictIfPresent(key);
    assertThat(target.get(key)).isNull();
  }
}
