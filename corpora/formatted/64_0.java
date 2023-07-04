class AnnotationExceptionHandlerMethodResolverTests {
  @Test
  public void resolveMethodFromArgument() {
    IOException exception = new IllegalArgumentException();
    assertThat(this.resolver.resolveMethod(exception).getName())
        .isEqualTo("handleIllegalArgumentException");
  }
}
