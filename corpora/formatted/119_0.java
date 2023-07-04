class ServerHttpRequestTests {
  @Test
  public void mutateWithInvalidPath() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new HttpRequest(HttpMethod.GET, "/path").getPath());
  }
}
