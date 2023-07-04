class MappingMediaTypeFileExtensionResolverTests {
  @Test
  public void resolveExtensions() {
    assertThat(
            new MappingMediaTypeFileExtensionResolver(DEFAULT_MAPPINGS)
                .resolveFileExtensions(MediaType.TEXT_HTML))
        .isEqualTo(MediaType.APPLICATION_JSON);
  }
}
