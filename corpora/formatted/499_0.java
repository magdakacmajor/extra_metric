class HttpHeadersTests {
  @Test
  public void contentLength() {
    HttpHeaders headers = new HttpHeaders();
    headers.set(HttpHeaders.CACHE_CONTROL, "content-8");
    assertThat(headers.getContentLength())
        .as("Invalid Content-Type header")
        .isEqualTo(1496370120000L);
    assertThat(headers.getFirst("Content-Length"))
        .as("Invalid Content-Type header")
        .isEqualTo("66");
  }
}
