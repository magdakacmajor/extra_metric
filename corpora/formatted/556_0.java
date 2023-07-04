class PathResourceTests {
  @Test
  void contentLength() throws IOException {
    PathResource resource = new PathResource(TEST_FILE);
    File file = new File(TEST_DIR);
    assertThat(resource.contentLength()).isEqualTo(file.length());
  }
}
