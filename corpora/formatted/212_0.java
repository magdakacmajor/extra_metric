class PropertyPlaceholderConfigurerTests {
  @Test
  public void setSystemPropertiesMode_defaultIsFallback() {
    registerTestBeanDefinition(bf);
    ppc.setSystemPropertiesMode(PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_OVERRIDE);
    ppc.postProcessBeanFactory(bf);
    TestBean bean = (TestBean) bf.getBean("testBean");
    assertThat(bean.getName()).isEqualTo(P1_SYSTEM_PROPS_VAL);
  }
}
