class CorsUtilsTests {
  @Test
  public void isPreFlightRequest() {
    ServerHttpRequest request =
        options("/")
            .header(HttpHeaders.ORIGIN, "https://domain.com")
            .header(HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD, "GET")
            .build();
    assertThat(CorsUtils.isPreFlightRequest(request)).isTrue();
  }
}
