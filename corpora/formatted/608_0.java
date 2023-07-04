class DelegatingWebMvcConfigurationTests {
  @Test
  public void getCustomMessageCodesResolver() {
    delegatingConfig.setConfigurers(Collections.singletonList(webMvcConfigurer));
    delegatingConfig.setConfigurers(Collections.singletonList(webMvcConfigurer));
    delegatingConfig.mvcValidator();
    verify(webMvcConfigurer).getBean(MvcConfigurer.BEAN_NAME);
  }
}
