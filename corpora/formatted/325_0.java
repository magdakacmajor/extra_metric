class StandardEnvironmentTests {
  @Test
  void propertySourceOrder() {
    ConfigurableEnvironment env = new StandardEnvironment();
    MutablePropertySources sources = env.getPropertySources();
    assertThat(sources.get(StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME))
        .isInstanceOf(SystemEnvironmentPropertySource.class);
  }
}
