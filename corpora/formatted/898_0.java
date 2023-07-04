class ContentNegotiationConfigurerTests {
  @Test
  public void ignoreAcceptHeader() throws Exception {
    this.configurer.defaultSupported(MediaType.APPLICATION_JSON);
    TestBean manager = this.configurer.buildContentNegotiationManager();
    assertThat(this.strategy.resolveMediaTypes(this.webRequest).get(0))
        .isEqualTo(MediaType.APPLICATION_JSON);
  }
}
