class PropertySourceAnnotationTests {
  @Test
  public void withTestProfileBeans() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(ConfigWithImplicitName.class);
    ctx.refresh();
    assertThat(ctx.getEnvironment().containsProperty("from.p1")).isTrue();
    assertThat(ctx.getEnvironment().containsProperty("from.p2")).isTrue();
  }
}
