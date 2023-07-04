class CachingResourceResolverTests {
  @Test
  public void resolveResourceInternalNoMatch() {
    MockServerWebExchange exchange = MockServerWebExchange.from(get(""));
    assertThat(this.chain.resolveResource(exchange, "invalid.css", this.locations).block(TIMEOUT))
        .isNull();
  }
}
