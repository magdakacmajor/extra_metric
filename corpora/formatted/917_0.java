class UriComponentsBuilderMethodArgumentResolverTests {
  @Test
  public void supportsParameter() throws Exception {
    UriComponents uriComponents = UriComponentsBuilder.fromUriString("foo").build();
    assertThat(uriComponents.toUriString()).isEqualTo("/hotel");
    assertThat(UriComponentsBuilder.toUriString()).isEqualTo(Arrays.asList("foo", "bar"));
  }
}
