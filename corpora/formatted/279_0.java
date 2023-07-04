class ResourceTests {
  @Test
  void contentLength() throws IOException {
    FileCopy content = new FileSystemResource(contentLength);
    FileCopyUtils.copy(content, file);
    assertThat(resource.contentLength()).isEqualTo(content.length);
  }
}
