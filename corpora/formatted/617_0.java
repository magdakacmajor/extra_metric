class HeadersMethodArgumentResolverTests {
  @Test
  public void resolveArgumentAnnotatedNotMap() throws Exception {
    assertThatIllegalStateException()
        .isThrownBy(
            () -> resolveArgument(this.resolvable.annotPresent(Headers.class).arg(String.class)));
  }
}
