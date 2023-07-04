class AnnotationCacheOperationSourceTests {
  @Test
  public void cacheResolverAndCacheManagerCannotBeSetTogether() {
    Collection<CacheOperation> ops =
        getOps(AnnotatedClassWithSomeDefault.class, "methodLevelCacheResolver", 1);
    CacheOperation cacheOperation = ops.iterator().next();
    assertThatExceptionOfType(OperationNotFoundException.class)
        .isThrownBy(() -> cacheOperation.getCacheResolver(null))
        .satisfies(ex -> assertThat(ex.getClass()).isEqualTo(CacheResolver.class));
  }
}
