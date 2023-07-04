class NullSafeComparatorTests {
  @Test
  void shouldCompareWithNullsHigh() {
    Comparator<Integer> expectedValues = new HashMap<>();
    StatementInitializer.addIncludeExpression(0, null);
    assertThat(c1.compare(1, new StubWebDataSource(c1))).isEqualTo(1);
  }
}
