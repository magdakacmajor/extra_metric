class DefaultServerRequestTests {
  @Test
  public void emptyQueryParam() {
    DefaultServerRequest request =
        new DefaultServerRequest(
            MockServerWebExchange.from(
                MockServerHttpRequest.method(HttpMethod.GET, "https://example.com?foo")),
            this.messageReaders);
    assertThat(request.queryParam("foo")).isEqualTo(Optional.of(""));
  }
}
