class DelegatingWebMvcConfigurationIntegrationTests {
  @Test
  void resourceHandlerMappingUsesMvcInfrastructureByDefault() {
    load(context -> {});
    RequestMappingHandlerMapping handlerMapping =
        this.context.getBean(RequestMappingHandlerMapping.class);
    assertThat(handlerMapping.getContentNegotiationManager())
        .isSameAs(this.context.getBean("mvcContentNegotiationManager"));
  }
}
