class ConfigurationClassWithConditionTests {
  @Test
  public void methodConditional() throws Exception {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(ConfigWithCondition.class, ConditionConfig.class);
    ctx.refresh();
    assertThat(ctx.containsBean("bean1")).isTrue();
    assertThat(ctx.containsBean("bean3")).isTrue();
  }
}
