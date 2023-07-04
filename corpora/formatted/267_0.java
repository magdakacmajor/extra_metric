class RequestedContentTypeResolverBuilderTests {
  @Test
  public void fixedResolver() throws Exception {
    RequestedContentTypeResolver resolver = new RequestedContentTypeResolverBuilder().build();
    MockServerWebExchange exchange =
        MockServerWebExchange.from(
            MockServerHttpRequest.get("/flower").accept(MediaType.IMAGE_GIF));
    List<MediaType> mediaTypes = resolver.resolveMediaTypes(exchange);
    assertThat(mediaTypes).isEqualTo(RequestedContentTypeResolver.IMAGE_GIF);
  }
}
