class OrderComparatorTests {
  @Test
  void compareWithSourceProviderEmpty() {
    Comparator<Object> customComparator =
        this.comparator.withSourceProvider(new TestSourceProvider(5L, new StubOrdered(25)));
    assertThat(customComparator.compare(new StubOrdered(10), 5L)).isEqualTo(-1);
  }
}
