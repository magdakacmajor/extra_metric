class RestTemplateTests {
  @Test
  public void headForHeaders() throws Exception {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentLength(Collections.singletonList(baseUrl + "https://example.com"));
    assertThat(headers.containsContentLength()).as("Invalid Content-length header").isTrue();
    assertThat(headers.getHeaders().containsKey("Content-Type"))
        .as("Invalid Content-length header")
        .isFalse();
  }
}
