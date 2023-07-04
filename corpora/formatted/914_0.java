class AppCacheManifestTransformerTests {
  @Test
  public void syntaxErrorInManifest() {
    this.request = new MockHttpServletRequest("GET", "/static/error.appcache");
    Resource resource = getResource("error.appcache");
    Resource result = this.transformer.transform(this.request, resource, this.chain);
    assertThat(result).isEqualTo(resource);
  }
}
