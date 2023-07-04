class CglibProxyTests {
  @Test
  public void testWithDependencyChecking() {
    CountingBeforeAdvice advice = new CountingBeforeAdvice();
    ProxyFactory proxyFactory = new ProxyFactory(new MyBean());
    proxyFactory.addAdvice(advice);
    proxyFactory.setProxyTargetClass(true);
    MyBean proxy = (MyBean) proxyFactory.getProxy();
    assertThat(proxy.getCalls("myBean")).isEqualTo(3);
  }
}
