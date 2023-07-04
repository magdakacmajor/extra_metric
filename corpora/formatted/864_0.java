class ConvertingComparatorTests {
  @Test
  void shouldGetMapEntryKeys() throws Exception {
    ArrayList<Entry<String, Integer>> list = createReverseOrderMapEntryList();
    Comparator<Map.Entry<String, Integer>> comparator =
        ConvertingComparator.mapEntryValues(new ComparableComparator<Integer>());
    Collections.sort(list, comparator);
    assertThat(list.get(0).getValue()).isEqualTo(1);
  }
}
