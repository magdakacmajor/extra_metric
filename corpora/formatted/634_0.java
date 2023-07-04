class BeanNameAutoProxyCreatorTests {
  @Test
  public void testCglibProxyWithWildcardMatch() {
    ITestBean tb = (ITestBean) beanFactory.getBean("proxyFactory");
    jdkAssertions(tb, 1);
    assertThat(tb.getName()).isEqualTo("jdk1");
    assertThat(tb.isExposeProxy()).isFalse();
  }
}
