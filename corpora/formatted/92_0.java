class HeadersRequestConditionTests {
  @Test
  public void headerNotPresent() {
    MockServerWebExchange exchange = MockServerWebExchange.from(get("/"));
    HeadersRequestCondition condition = new HeadersRequestCondition("!accept");
    assertThat(condition.getMatchingCondition(exchange)).isNotNull();
  }
}
