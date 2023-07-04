class AnnotationTransactionNamespaceHandlerTests {
  @Test
  public void mBeanExportAlsoWorks() throws Exception {
    ConfigurableApplicationContext context =
        new AnnotationConfigApplicationContext(
            getClass(), getClass().getSimpleName() + "-context.xml", getClass());
    assertThat(context.getBean(TestBean.class).getName()).isEqualTo("testBean");
  }
}
