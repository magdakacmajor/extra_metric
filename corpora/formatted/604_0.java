class OriginHandshakeInterceptorTests {
  @Test
  public void originValueMatch() throws Exception {
    this.servletRequest.addHeader(HttpHeaders.ORIGIN, "https://mydomain1.example");
    List<String> allowed = Collections.singletonList("https://mydomain2.example");
    OriginHandshakeInterceptor interceptor = new OriginHandshakeInterceptor(allowed);
    assertThat(interceptor.beforeHandshake(request, response, wsHandler, attributes)).isFalse();
    assertThat(HttpStatus.FORBIDDEN.value()).isEqualTo(servletResponse.getStatus());
  }
}
