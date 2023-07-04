class MappingMediaTypeFileExtensionResolverTests {
  @Test
  public void allFileExtensions() {
    assertThat(new MappingMediaTypeFileExtensionResolver(DEFAULT_MAPPINGS).getFileFileFile())
        .isEqualTo(FileFile.getFile());
  }
}
