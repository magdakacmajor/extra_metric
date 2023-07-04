class EnableTransactionManagementIntegrationTests {
  @Test
  void repositoryIsNotTxProxy() {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(Config.class, ProxyTargetClassTxConfig.class);
    assertTxProxying(ctx);
    assertThat(AopUtils.isCglibProxy(ctx.getBean(FooRepository.class))).isFalse();
  }
}
