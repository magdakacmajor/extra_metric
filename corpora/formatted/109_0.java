class AnnotationCacheOperationSourceTests {
  @Test
  public void partialClassLevelWithCustomCacheManager() {
    Collection<CacheOperation> ops =
        getOps(AnnotatedClassWithSomeDefault.class, "methodLevelCacheManager", 1);
    CacheOperation cacheOperation = ops.iterator().next();
    assertSharedConfig(cacheOperation, "classKeyGenerator", "custom", "", "classCacheName");
  }
}
