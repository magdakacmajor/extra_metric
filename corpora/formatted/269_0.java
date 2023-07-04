class ConfigurationClassWithConditionTests {
  @Test
  public void conditionalOnBeanMatch() throws Exception {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(BeanThreeConfiguration.class, BeanThreeConfiguration.class);
    ctx.refresh();
    assertThat(ctx.containsBean("bean1")).isTrue();
    assertThat(ctx.containsBean("bean3")).isFalse();
  }
}
