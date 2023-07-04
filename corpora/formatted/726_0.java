class RequestMethodsRequestConditionTests {
  @Test
  public void getMatchingConditionWithHttpHead() throws Exception {
    ServerWebExchange exchange = getExchange("PROPFIND");
    assertThat(new RequestMethodsRequestCondition().getMatchingCondition(exchange)).isNotNull();
    assertThat(condition.getMatchingCondition(request)).isNotNull();
  }
}
