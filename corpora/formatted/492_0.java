class EnableCachingTests {
  @Test
  public void multipleCacheManagerBeans_implementsCachingConfigurer() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(MultiCacheManagerConfig.class);
    try {
      ctx.refresh();
    } catch (IllegalStateException ex) {
      assertThat(ex.getMessage().contains("no unique bean of type CacheManager")).isTrue();
    }
  }
}
