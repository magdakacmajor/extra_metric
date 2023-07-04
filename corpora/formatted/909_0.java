class DefaultRenderingBuilderTests {
  @Test
  public void header() throws Exception {
    LinkedHeaders headers = new LinkedHeaders();
    headers.add("foo", "bar");
    Rendering rendering = Rendering.view("foo").headers(headers).build();
    assertThat(rendering.headers()).isEqualTo(headers);
  }
}
