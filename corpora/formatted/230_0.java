class UriComponentsBuilderTests {
  @Test
  public void pathWithDuplicateSlashes() {
    UriComponents uriComponents =
        UriComponentsBuilder.fromUriString("/foo/bar").pathSegment("q", "/foo/bar").build();
    assertThat(uriComponents.toUriString()).isEqualTo("/foo/bar");
    assertThat(result.getPathSegments()).isEqualTo(Arrays.asList("foo", "bar"));
  }
}
