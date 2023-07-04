class ConsumesRequestConditionTests {
  @Test
  public void consumesSingleNoMatch() {
    MockServerWebExchange exchange = postExchange("application/xml");
    ConsumesRequestCondition condition = new ConsumesRequestCondition("text/plain");
    assertThat(condition.getMatchingCondition(exchange)).isNull();
  }
}
