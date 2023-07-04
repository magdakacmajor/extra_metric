class JdkDynamicProxyTests {
  @Test
  public void testProxyNotWrappedIfIncompatible() {
    TestBean raw = new TestBean();
    raw.setAge(32);
    AdvisedSupport pc = new AdvisedSupport(ITestBean.class);
    pc.setTarget(raw);
    JdkDynamicAopProxy aop = new JdkDynamicAopProxy(pc);
    Object proxy = aop.getProxy();
    boolean condition = proxy instanceof ITestBean;
    assertThat(condition).isFalse();
    assertThat(proxy.getAge()).as("Advice return proxy").isEqualTo(proxy);
  }
}
