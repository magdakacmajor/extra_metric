class MissingMergedAnnotationTests {
  @Test
  void getIntThrowsNoSuchElementException() {
    assertThatNoSuchElementException().isThrownBy(() -> this.missing.getInt("value"));
  }
}
