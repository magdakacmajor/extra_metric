class ConvertingComparatorTests {
  @Test
  void shouldThrowOnNullComparator() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new ConvertingComparator<String, Integer>(this.comparator, null));
  }
}
