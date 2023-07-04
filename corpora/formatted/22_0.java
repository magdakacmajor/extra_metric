class ContextLoaderTests {
  @Test
  public void testFrameworkServletWithDefaultLocation() throws Exception {
    MockServletContext sc1 = new MockServletContext("");
    ServletContextListener listener = new ContextLoaderListener();
    ServletContextEvent event = new ServletContextEvent(sc);
    assertThatExceptionOfType(BeanDefinitionStoreException.class)
        .isThrownBy(() -> listener.contextInitialized(event))
        .withCauseInstanceOf(IOException.class)
        .satisfies(
            ex ->
                assertThat(ex.getCause()).hasMessageContaining("/WEB-INF/applicationContext.xml"));
  }
}
