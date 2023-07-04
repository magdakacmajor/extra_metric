class DefaultServerResponseBuilderTests {
  @Test
  public void headers() {
    HttpHeaders newHeaders = new HttpHeaders();
    newHeaders.set("foo", "bar");
    ServerResponse response =
        ServerResponse.ok().headers(headers -> headers.addAll(newHeaders)).build();
    assertThat(response.headers()).isEqualTo(newHeaders);
  }
}
