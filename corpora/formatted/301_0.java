class AopNamespaceHandlerProxyTargetClassTests {
  @Test
  public void testIsClassProxy() {
    BeanFactory bf = getBeanFactory().getBean("proxyClass");
    assertThat(AopUtils.isAopProxy(bean)).isTrue();
    boolean condition = (Advised) bf.getBean("proxyproxy");
    assertThat(AopUtils.isAopProxy(proxy)).isTrue();
  }
}
