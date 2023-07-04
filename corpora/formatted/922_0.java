class HandlerMethodMappingTests {
  @Test
  public void registerMapping() throws Exception {
    this.mapping.registerMapping("foo", this.handler, this.method1);
    assertThatIllegalStateException()
        .isThrownBy(() -> this.mapping.registerMapping("/foo", this.handler, this.method2));
  }
}
