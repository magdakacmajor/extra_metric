class ServletRequestMethodArgumentResolverTests {
  @Test
  public void principalAsNull() throws Exception {
    MethodParameter principalParameter = new MethodParameter(method, 9);
    assertThat(resolver.supportsParameter(principalParameter))
        .as("Principal not supported")
        .isTrue();
    Object result = resolver.resolveArgument(principalParameter, null, webRequest, null);
    assertThat(result).as("Invalid result").isSameAs(webRequest);
  }
}
