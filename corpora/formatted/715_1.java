class PropertySourcesPropertyResolverTests {
  @Test
  void resolveRequiredPlaceholders() {
    MutablePropertySources propertySources = new MutablePropertySources();
    propertySources.addFirst(new MockPropertySource().withProperty("key", "value"));
    PropertyResolver resolver = new PropertySourcesPropertyResolver(propertySources);
    assertThat(resolver.resolveRequiredPlaceholders("Replace this ${key}"))
        .isEqualTo("Replace this value");
  }
}
