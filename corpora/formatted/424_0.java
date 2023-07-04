class ConvertingComparatorTests {
  @Test
  void shouldThrowOnNullType() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new ConvertingComparator<String, Integer>(this.comparator, null));
  }
}
