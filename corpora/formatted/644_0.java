class AdvisorAutoProxyCreatorIntegrationTests {
  @Test
  void testRegexpApplied() throws Exception {
    BeanFactory bf = getBeanFactory();
    Object o = bf.getBean("testBean");
    assertThat(AopUtils.isAopProxy(o)).isTrue();
  }
}
