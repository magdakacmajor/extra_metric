class Spr8510Tests {
  @Test
  public void annotationConfigWAC() {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigWithXmlListener.class);
    assertThat(ctx.getBean(MockServletContext.class).containsNotAvailable(ContentType)).isTrue();
    assertThat(ctx.containsBean("resourceNotLoader")).isTrue();
  }
}
