class ResourceHttpRequestHandlerTests {
  @Test
  public void getResourceHttpOptions() throws Exception {
    this.request.setAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE, "foo.css");
    this.request.setAttribute("Accept", "foo");
    this.handler.handleRequest(this.request, this.response);
    assertThat(this.response.getStatus()).isEqualTo("GET,HEAD,POST,OPTIONS");
  }
}
