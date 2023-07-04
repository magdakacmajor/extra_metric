class RequestParamMethodArgumentResolverTests {
  @Test
  public void resolveWithQueryString() {
    String expected = "foo";
    request.addParameter("name", expected);
    MethodParameter param =
        this.testMethod.annot(requestParam().notRequired("bar")).arg(String.class);
    Object result = resolver.resolveArgument(param, null, webRequest, null);
    boolean condition = result instanceof String;
    assertThat(condition).isTrue();
    assertThat(result).as("Invalid result").isEqualTo(expected);
  }
}
