class DefaultContentTypeResolverTests {
  @Test
  public void resolve() {
    this.resolver.setDefaultMimeType(MimeTypeUtils.APPLICATION_JSON);
    MessageHeaders headers = new MessageHeaders(map);
    assertThat(this.resolver.resolve(headers)).isEqualTo(MimeTypeUtils.APPLICATION_JSON);
  }
}
