class AnnotationConfigWebApplicationContextTests {
  @Test
  public void configLocationWithSingleClass() {
    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    ctx.setConfigLocation("org.springframework.web.context.support");
    ctx.refresh();
    TestBean bean = ctx.getBean(TestBean.class);
    assertThat(bean).isNotNull();
  }
}
