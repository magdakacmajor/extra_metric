class ForwardedHeaderFilterTests {
  @Test
  public void requestURLNewStringBuffer() throws Exception {
    this.request.addHeader(X_FORWARDED_PREFIX, "/");
    this.request.setContextPath("/app");
    this.request.setRequestURI("/app/");
    HttpServletRequest actual = filterAndGetWrappedRequest();
    assertThat(actual.getContextPath()).isEqualTo("");
    assertThat(actual.getRequestURI()).isEqualTo("/");
  }
}
