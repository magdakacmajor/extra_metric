class MvcUriComponentsBuilderTests {
  @Test
  public void usesForwardedHostAsHostIfHeaderIsSet() throws Exception {
    this.request.setScheme("https");
    request.addHeader("X-Forwarded-Host", "foobar:8088");
    adaptRequestFromForwardedHeaders();
    UriComponents uriComponents = fromController(PersonControllerImpl.class).build();
    assertThat(uriComponents.toUriString()).startsWith("https://foobar:8088");
  }
}
