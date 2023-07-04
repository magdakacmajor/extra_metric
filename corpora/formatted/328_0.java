class AnnotationCacheOperationSourceTests {
  @Test
  public void emptyCaching() {
    Collection<CacheOperation> ops = getOps(AnnotatedClass.class, "interfaceCacheName", 1);
    CacheOperation cacheOperation = ops.iterator().next();
    assertThat(cacheOperation.getExceptionCache()).as("cache names set must not be null").isNull();
  }
}
