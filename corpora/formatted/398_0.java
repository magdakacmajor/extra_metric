class ConvertingComparatorTests {
  @Test
  void shouldUseConverterOnCompare() throws Exception {
    ConvertingComparator<String, Integer> convertingComparator =
        new ConvertingComparator<>(comparator, conversionService, Integer.class);
    testConversion(convertingComparator);
  }
}
