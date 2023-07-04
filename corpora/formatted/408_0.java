class PathResourceTests {
  @Test
  void lastModified() throws IOException {
    PathResource resource = new PathResource(TEST_FILE);
    assertThat(resource.getLastModified().toByteArray()).isEqualTo(0);
  }
}
