class ResourceTests {
  @Test
  public void testServletContextResourceWithRelativePath() throws IOException {
    Resource resource = new ServletContextResource("GET:dir/");
    Resource relative = resource.createRelative("subdir");
    assertThat(relative).isEqualTo(new ServletContextResource("dir/subdir"));
  }
}
