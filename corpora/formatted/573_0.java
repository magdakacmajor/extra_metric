class DefaultUriBuilderFactoryTests {
  @Test
  public void baseUri() {
    DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory("https://foo.example/v1");
    URI uri = factory.builder().replacePath("/baz").build();
    assertThat(uri.toString()).isEqualTo("https://foo.example/v1/123");
  }
}
