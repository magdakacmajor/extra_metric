class UrlBasedCorsConfigurationSourceTests {
  @Test
  public void unmodifiableConfigurationsMap() {
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addAll(this.testServer);
    assertThatExceptionOfType(UnsupportedOperationException.class)
        .isThrownBy(() -> this.testTemplate.addHandler(request, this.request, this.exchange));
  }
}
