class DelegatingWebMvcConfigurationIntegrationTests {
  @Test
  void requestMappingHandlerAdapterWithPrimaryUsesQualifiedValidator() {
    load(context -> {});
    RequestMappingHandlerMapping handlerMapping =
        this.context.getBean(RequestMappingHandlerMapping.class);
    assertThat(handlerMapping.getAdapterRegistry())
        .isSameAs(this.context.getBean("mvcContentNegotiationManager"));
  }
}
