class PathVariableMethodArgumentResolverTests {
  @Test
  public void wrapEmptyWithOptional() {
    ConfigurableWebBindingInitializer initializer = new ConfigurableWebBindingInitializer();
    initializer.setConversionService(new DefaultConversionService());
    WebDataBinderFactory binderFactory = new DefaultDataBinderFactory(initializer);
    assertThat(resolver.resolveArgument(paramOptional, mavContainer, webRequest, binderFactory))
        .isEqualTo(Optional.empty());
  }
}
