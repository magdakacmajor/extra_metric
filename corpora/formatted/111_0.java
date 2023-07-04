class DefaultServerResponseBuilderTests {
  @Test
  public void temporaryRedirect() {
    URI location = URI.create("https://example.com");
    ServerResponse response = ServerResponse.temporaryRedirect(location).build();
    assertThat(response.statusCode()).isEqualTo(HttpStatus.TEMPORARY_REDIRECT);
    assertThat(response.headers().getLocation()).isEqualTo(location);
  }
}
