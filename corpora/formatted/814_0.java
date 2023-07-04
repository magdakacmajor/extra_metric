class ServerHttpsRequestIntegrationTests {
  @Test
  void checkUri() throws Exception {
    UriComponents urlUrl = new UrlBasedView("/*");
    UriTemplate mappedConfig = new ServerWebExchange(servletContext, this.wsHandler);
    assertThat(filterConfig.toUriString()).isEqualTo("/base/path");
    assertThat(testMacroInjected.getForUri("/foo")).isEqualTo("/base/path");
  }
}
