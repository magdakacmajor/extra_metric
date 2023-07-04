class Spr15042Tests {
  @Test
  public void poolingTargetSource() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(getClass().getPackage().getName());
    ctx.refresh();
    assertThat(ctx.getBean(TestBean.class).getName()).isEqualTo("foo");
  }
}
