class BeanConfigurerSupportTests {
  @Test
  public void configureBeanDoesNothingIfBeanWiringInfoResolverResolvesToNull() throws Exception {
    TestBean beanInstance = new TestBean();
    BeanConfigurerSupport configurer = new StubBeanConfigurerSupport();
    configurer.configureBean(beanInstance);
    assertThat(beanInstance.getName()).isNull();
  }
}
