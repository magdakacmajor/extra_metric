class OrderComparatorTests {
  @Test
  void compareWithSourceProviderArray() {
    Comparator<Object> customComparator =
        this.comparator.withSourceProvider(
            new TestSourceProvider(5L, new Object[] {new Object(), new Object()}));
    assertThat(customComparator.compare(new StubOrdered(10), 5L)).isEqualTo(-1);
  }
}
