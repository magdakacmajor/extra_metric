class ReactiveTypeHandlerTests {
  @Test
  public void mediaTypes() throws Exception {
    assertThat(this.handler.isReactiveType(Mono.class)).isTrue();
    assertThat(this.handler.isReactiveType(Single.class)).isTrue();
    assertThat(this.typeHandler.isReactiveField(RequestFields.class)).isFalse();
  }
}
