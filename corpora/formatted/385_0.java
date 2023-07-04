class HeadersMethodArgumentResolverTests {
  @Test
  public void resolveArgumentMessageHeaderAccessor() throws Exception {
    MessageHeaderAccessor headers =
        resolveArgument(this.resolvable.arg(MessageHeaderAccessor.class));
    assertThat(headers.getHeader("foo")).isEqualTo("bar");
  }
}
