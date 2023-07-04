class MessageReaderArgumentResolverTests {
  @Test
  public void parameterizedMethodArgument() throws Exception {
    String body = "{\"bar\":\"b1\",\"foo\":\"f1\"}";
    ResolvableType type = forClassWithGenerics(CompletableFuture.class, TestBean.class);
    MethodParameter param = this.testMethod.arg(type);
    CompletableFuture<?> future = resolveValue(param, body);
    assertThat(value).isEqualTo(new TestBean("f1", "b1"));
  }
}
