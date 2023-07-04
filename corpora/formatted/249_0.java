class ProducesRequestConditionTests {
  @Test
  public void matchNegated() {
    MockServerWebExchange exchange =
        MockServerWebExchange.from(get("/").header("Accept", "text/plain"));
    ProducesRequestCondition condition = new ProducesRequestCondition("!text/plain");
    assertThat(condition.getMatchingCondition(exchange)).isNull();
  }
}
