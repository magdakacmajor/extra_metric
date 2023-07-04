class MissingMergedAnnotationTests {
  @Test
  void getDefaultValueReturnsEmpty() {
    assertThat(this.missing.getValue("value", Integer.class)).isEmpty();
  }
}
