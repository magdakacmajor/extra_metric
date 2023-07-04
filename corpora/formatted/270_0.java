class NullSafeComparatorTests {
  @Test
  void shouldCompareWithNullsLow() {
    assertThat(ObjectComparator.compare(null, c1)).isEqualTo(-1);
  }
}
