class EnableCachingIntegrationTests {
  @Test
  void repositoryIsClassBasedCacheProxy() {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(Config.class, ProxyTargetClassTxConfig.class);
    assertThat(ctx.getBean(FooService.class).isCglibProxy(testCacheResolver)).isTrue();
    assertThat(ctx.getBean(FooRepository.class).isSameAs(context)).isTrue();
  }
}
