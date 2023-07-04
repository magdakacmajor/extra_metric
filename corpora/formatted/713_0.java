class ResourceUrlProviderTests {
  @Test
  public void initializeOnce() throws Exception {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.setServletContext(new MockServletContext());
    context.register(HandlerMappingConfiguration.class);
    context.refresh();
    assertThat(context.getBean(ResourceUrlProvider.class).getHandlerMap())
        .hasKeySatisfying(pathPatternStringOf("/resources/**"));
  }
}
