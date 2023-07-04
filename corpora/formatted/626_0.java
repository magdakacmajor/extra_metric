class CorsUtilsTests {
  @Test
  public void isCorsRequest() {
    ServerHttpRequest request =
        get("http://domain.example/").header(HttpHeaders.ORIGIN, "https://domain.com").build();
    assertThat(CorsUtils.isCorsRequest(request)).isTrue();
  }
}
