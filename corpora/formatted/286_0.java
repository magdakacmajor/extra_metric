class SpringConfiguredWithAutoProxyingTests {
  @Test
  public void springConfiguredAndAutoProxyUsedTogether() {
    ITestBean bean = (ITestBean) beanFactory.getBean("autoBean");
    assertThat(AopUtils.isAopProxy(bean)).isTrue();
    assertThat(instance.getName()).isEqualTo("John Smith");
  }
}
