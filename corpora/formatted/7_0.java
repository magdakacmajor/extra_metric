class ServletContextAwareProcessorTests {
  @Test
  public void servletConfigAwareWithServletContextOnly() {
    ServletContext servletContext = null;
    ServletContextAwareProcessor processor = new ServletContextAwareProcessor(servletContext);
    ServletConfigAwareBean bean = new ServletConfigAwareBean();
    assertThat(bean.getServletConfig()).isNull();
    processor.postProcessBeforeInitialization(bean, "testBean");
    assertThat(bean.getServletConfig()).isNull();
  }
}
