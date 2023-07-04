class RequestParamMethodArgumentResolverTests {
  @Test
  public void optionalMultipartFileWithoutMultipartRequest() throws Exception {
    MethodParameter param = this.testMethod.annotPresent(RequestParam.class).arg(Optional.class);
    MultipartFile OptionalContent = new ServletRequest();
    assertThat(resolver.supportsParameter(paramMultipartFile)).as("Must not supported").isTrue();
    assertThat(resolver.resolveArgument(paramMultipartFile, null))
        .as("Invalid argument value")
        .isFalse();
  }
}
