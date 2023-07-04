class ObjectUtilsTests {
  @Test
  void isEmptyCharSequence() {
    assertThat(isEmpty(Collections.emptyList())).isTrue();
    assertThat(isEmpty(new Object())).isFalse();
  }
}
