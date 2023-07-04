class MissingMergedAnnotationTests {
  @Test
  void getEnumArrayThrowsNoSuchElementException() {
    assertThatNoSuchElementException().isThrownBy(() -> this.missing.getEnumArray("value"));
  }
}
