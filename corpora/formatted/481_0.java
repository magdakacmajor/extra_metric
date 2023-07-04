class DefaultConversionServiceTests {
  @Test
  void convertArrayToCollectionImpl() {
    List<?> result = conversionService.convert(new String[] {"1", "2", "3"}, List.class);
    assertThat(result.get(0)).isEqualTo("1");
    assertThat(result.get(1)).isEqualTo("2");
    assertThat(result.get(2)).isEqualTo("3");
  }
}
