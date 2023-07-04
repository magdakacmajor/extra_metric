class DefaultServerRequestTests {
  @Test
  public void uri() {
    MockHttpServletRequest servletRequest = new MockHttpServletRequest("GET", "/");
    servletRequest.setServerName("example.com");
    servletRequest.setScheme("https");
    servletRequest.setServerPort(443);
    DefaultServerRequest request = new DefaultServerRequest(servletRequest, this.messageConverters);
    assertThat(request.uri()).isEqualTo(URI.create("https://example.com/"));
  }
}
