class HeadersMethodArgumentResolverTests {
  @Test
  public void resolveArgumentAnnotated() throws Exception {
    MethodParameter param =
        this.resolvable.annotPresent(Headers.class).arg(Map.class, String.class, Object.class);
    Map<String, Object> headers = resolveArgument(param);
    assertThat(headers.get("foo")).isEqualTo("bar");
  }
}
