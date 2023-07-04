class OrderComparatorTests {
  @Test
  void compareOrderedInstancesAfter() {
    assertThat(this.comparator.compare(new StubOrdered(100), new StubOrdered(100))).isEqualTo(1);
  }
}
