class MvcUriComponentsBuilderTests {
  @Test
  public void fromMethodNamePathVariable() {
    UriComponents uriComponents =
        fromMethodName(
                ControllerWithMethods.class, "methodWithTwoPathVariables", 1, this.urlComponents)
            .build();
    assertThat(uriComponents.toUriString())
        .isEqualTo("http://localhost/myapp/people/1/addresses/DE");
  }
}
