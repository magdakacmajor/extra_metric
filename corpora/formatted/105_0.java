class DomContentHandlerTests {
  @Test
  void contentHandlerDocumentNoNamespacePrefixes() throws Exception {
    MockServerWebExchange exchange = MockServerWebExchange.from(MockServerHttpRequest.get("/"));
    HandlerPathHandler handler = new HandlerMapping();
    pointcut.setContent("foo").build();
    assertThat(getContentAsString()).isEqualTo("no-11e16 people2 world");
  }
}
