class TransactionAwareCacheDecoratorTests {
  @Test
  public void evictTransactional() {
    Cache target = new ConcurrentMapCache("testCache");
    Cache cache = new TransactionAwareCacheDecorator(target);
    Object key = new Object();
    cache.put(key, "123");
    txTemplate.executeWithoutResult(
        s -> {
          cache.evict(key, "123");
          assertThat(target.get(key, String.class)).isEqualTo("123");
        });
    assertThat(target.get(key)).isNull();
  }
}
