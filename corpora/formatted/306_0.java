class BooleanComparatorTests {
  @Test
  void shouldCompareFromTrueLow() {
    Comparator<Boolean> c = new BooleanComparator(true);
    assertThat(c.compare(true, false)).isEqualTo(-1);
    assertThat(c.compare(Boolean.TRUE, Boolean.TRUE)).isEqualTo(0);
  }
}
