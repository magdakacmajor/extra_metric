class HeaderMethodArgumentResolverTests {
  @Test
  public void resolveOptionalHeaderAsEmpty() throws Exception {
    Message<String> message = MessageBuilder.withPayload("foo").build();
    MethodParameter param = this.resolvable.annot(header("foo")).arg(Optional.class, String.class);
    Object result = resolveArgument(param, message);
    assertThat(result).isEqualTo(Optional.empty());
  }
}
