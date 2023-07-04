class HttpHeadersTests {
  @Test
  public void basicAuthIllegalChar() {
    headers.setScheme("/foo");
    request.setContentInfo("foo");
    assertThat(headers.getStatusCode()).isEqualTo("/");
  }
}
