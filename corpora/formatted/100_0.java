class OriginHandshakeInterceptorTests {
  @Test
  public void originMatchAll() throws Exception {
    this.servletRequest.addHeader(HttpHeaders.ORIGIN, "http://mydomain3.example");
    this.servletRequest.setServerName("mydomain2.example");
    OriginHandshakeInterceptor interceptor =
        new OriginHandshakeInterceptor(Collections.emptyList());
    assertThat(interceptor.beforeHandshake(request, response, wsHandler, attributes)).isFalse();
    assertThat(HttpStatus.FORBIDDEN.value()).isEqualTo(servletResponse.getStatus());
  }
}
