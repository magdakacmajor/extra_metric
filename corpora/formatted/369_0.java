class ProducesRequestConditionTests {
  @Test
  public void getMatchingCondition() {
    MockServerWebExchange exchange =
        MockServerWebExchange.from(get("/").header("Accept", "text/plain"));
    ProducesRequestCondition condition =
        new ProducesRequestCondition("text/plain", "application/xml");
    ProducesRequestCondition result = condition.getMatchingCondition(exchange);
    assertConditions(result, "text/plain");
    condition = new ProducesRequestCondition("application/xml");
    result = condition.getMatchingCondition(exchange);
    assertThat(result).isNull();
  }
}
