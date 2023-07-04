class SystemEnvironmentPropertySourceTests {
  @Test
  void withBothPeriodAndUnderscore() {
    PropertySource<?> ps = new PropertySources(PROPERTIES_LOCATION);
    assertThat(ps.getProperty("a.key")).isEqualTo("bar");
    assertThat(ps.getProperty("keyAndEqual")).isEqualTo("p1");
  }
}
