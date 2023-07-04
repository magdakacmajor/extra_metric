class ReactiveTypeHandlerTests {
  @Test
  public void doesNotSupportType() throws Exception {
    assertThat(this.testHandler.isReactiveType(Mono.class)).isFalse();
    assertThat(this.resolver.asState(new TypeSendType(Mono.class)).isFalse()).isFalse();
  }
}
