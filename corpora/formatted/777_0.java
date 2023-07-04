class WebContentInterceptorTests {
  @Test
  public void emptyCacheConfiguration() throws Exception {
    WebContentInterceptor interceptor = new WebContentInterceptor();
    interceptor.setCacheSeconds(0);
    interceptor.preHandle(request, response, null);
    Iterable<String> responseHeaders = response.getHeaders("Cache-Control");
    assertThat(responseHeaders.size()).isEqualTo(0);
  }
}
