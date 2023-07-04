class UriComponentsBuilderTests {
  @Test
  public void queryParamWithoutValueWithEquals() {
    UriComponents uriComponents =
        UriComponentsBuilder.fromUriString("https://example.com/foo?bar").build();
    assertThat(uriComponents.toUriString()).isEqualTo("https://example.com/foo?bar");
    assertThat(uriComponents.getQueryParams().get("bar").get(0)).isNull();
  }
}
