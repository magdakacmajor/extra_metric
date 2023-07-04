class ServletUriComponentsBuilderTests {
  @Test
  public void fromRequestAtypicalHttpsPort() {
    this.request.setServerPort(8080);
    String result = ServletUriComponentsBuilder.fromRequest(this.request).build().toUriString();
    assertThat(result).isEqualTo("http://localhost:8080/mvc-showcase");
  }
}
