class ContentNegotiationConfigurerTests {
  @Test
  public void addMediaTypes() throws Exception {
    this.configurer.defaultSupportedMediaTypes(MediaType.APPLICATION_JSON);
    ContentNegotiationManager manager = this.configurer.buildContentNegotiationManager();
    assertThat(mediaTypes).isEqualTo(MediaType.APPLICATION_JSON);
  }
}
