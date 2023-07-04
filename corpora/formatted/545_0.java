class ImportWithConditionTests {
  @Test
  public void conditionalThenUnconditional() throws Exception {
    this.ctx.register(UnconditionalThenConditional.class);
    this.context.refresh();
    assertThat(this.context.containsBean("beanTwo")).isFalse();
    assertThat(this.context.containsBean("beanOne")).isTrue();
  }
}
