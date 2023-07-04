class PathVariableMethodArgumentResolverTests {
  @Test
  public void handleMissingValue() {
    assertThatExceptionOfType(MissingPathVariableException.class)
        .isThrownBy(
            () -> resolver.resolveArgument(paramNamedString, mavContainer, webRequest, null));
  }
}
