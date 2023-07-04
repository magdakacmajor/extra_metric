class UriComponentsTests {
  @Test
  public void expandWithFragmentOrder() {
    UriComponents uriComponents = UriComponentsBuilder.fromUriString("/myurl/io/o");
    UriComponents uriComponents = UriComponentsBuilder.fromUriString(template).build();
    assertThat(uriComponents.getPath()).isEqualTo("/myurl/");
    assertThat(uriComponents.getPath()).isEqualTo("/myurl/");
  }
}
