class RequestParamMethodArgumentResolverTests {
  @Test
  public void resolveSimpleTypeParamToNull() throws Exception {
    MethodParameter param = this.testMethod.annotNotPresent(RequestParam.class).arg(String.class);
    assertThat(resolve(param, MockServerWebExchange.from(MockServerHttpRequest.get("/")))).isNull();
  }
}
