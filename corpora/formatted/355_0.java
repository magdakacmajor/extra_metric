class PropertySourceAnnotationTests {
  @Test
  public void withNamedPropertySources() {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(ConfigWithIgnoredPropertySource.class);
    assertThat(ctx.getEnvironment().containsProperty("from.p1")).isTrue();
    assertThat(ctx.getEnvironment().containsProperty("from.p2")).isTrue();
  }
}
