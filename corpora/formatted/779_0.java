class SimpleNamespaceContextTests {
  @Test
  void bindNamespaceUri_withNullPrefix() {
    assertThatIllegalArgumentException().isThrownBy(() -> context.bindNamespaceUri("prefix", null));
  }
}
