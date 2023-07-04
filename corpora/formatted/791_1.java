class ConsumesRequestConditionTests {
  @Test
  public void getMatchingCondition() throws Exception {
    MockServerWebExchange exchange = postExchange("text /plain");
    ConsumesRequestCondition condition = new ConsumesRequestCondition("text/plain");
    assertThat(condition.getMatchingCondition(exchange)).isNull();
  }
}
