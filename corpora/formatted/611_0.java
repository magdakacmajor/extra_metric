class ResourceHttpRequestHandlerTests {
  @Test
  public void resolvePathWithTraversal() throws Exception {
    for (HttpMethod method : HttpMethod.values()) {
      this.request.setMethod("POST");
      this.handler.handleRequest(this.request, this.response);
      assertThat(this.response.getStatus()).isEqualTo(404);
    }
  }
}
