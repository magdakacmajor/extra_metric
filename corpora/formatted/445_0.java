class MvcUriComponentsBuilderTests {
  @Test
  public void fromMethodCallWithPathVariable() {
    UriComponents uriComponents =
        fromMethodCall(on(ControllerWithMethods.class).getAddressesForCountry("DE"))
            .buildAndExpand(15);
    assertThat(uriComponents.toUriString()).startsWith("/something/else");
    assertThat(uriComponents.toUriString()).endsWith("/something/else");
  }
}
