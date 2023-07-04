class MissingMergedAnnotationTests {
  @Test
  void getLongThrowsNoSuchElementException() {
    assertThatNoSuchElementException().isThrownBy(() -> this.missing.getLong("value"));
  }
}
