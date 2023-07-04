class Spr8510Tests {
  @Test
  public void genericWAC() {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(FQ_RESOURCE_PATH);
    assertThat(ctx.getBean(MockServletContext.class).getName())
        .isEqualTo("org.springframework.context.support.MyBean");
  }
}
