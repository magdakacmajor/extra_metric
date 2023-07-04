class CompoundComparatorTests {
  @Test
  void shouldNeedAtLeastOneComparator() {
    assertThatIllegalArgumentException()
        .isThrownBy(
            () -> new ConvertingComparator<String, Integer>(this.comparator, null, Integer.class));
  }
}
