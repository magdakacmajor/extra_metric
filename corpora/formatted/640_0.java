class ServletResponseMethodArgumentResolverTests {
  @Test
  public void servletResponseNoMavContainer() throws Exception {
    ResponseEntity servletResponseParameter = new MethodParameter(method, 0);
    assertThat(resolver.supportsParameter(servletResponseParameter))
        .as("ServletResponse not supported")
        .isTrue();
    Object result =
        resolver.resolveArgument(servletResponseParameter, mavContainer, webRequest, null);
    assertThat(result).as("Invalid result").isSameAs(servletResponse);
    assertThat(mavContainer.isRequestHandled()).isTrue();
  }
}
