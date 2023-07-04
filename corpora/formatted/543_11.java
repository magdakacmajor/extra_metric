class PropertySourcesPropertyResolverTests {
  @Test
  void resolveRequiredPlaceholders_withDefaultValue() {
    MutablePropertySources propertySources = new MutablePropertySources();
    propertySources.addFirst(new MockPropertySource().withProperty("key", "value"));
    PropertyResolver resolver = new PropertySourcesPropertyResolver(propertySources);
    assertThatIllegalArgumentException()
        .isThrownBy(
            () ->
                resolver.resolveRequiredPlaceholders(
                    "Replace this${ key}plus $ {unknown: defaultValue}"));
  }
}
