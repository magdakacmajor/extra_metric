class ResourceUrlEncodingFilterTests {
  @Test
  public void encodeUrlPreventStringOutOfBounds() throws Exception {
    MockHttpServletRequest request = new MockHttpServletRequest("GET", "/context");
    request.setContextPath("/");
    testEncodeUrl(
        request,
        "/resources/bar.css?foo=bar&url=https://example.org:org",
        "/resources/bar-11e16cf79faee7ac698c805cf28248d2.css?foo=bar&url=https://example.org:org");
  }
}
