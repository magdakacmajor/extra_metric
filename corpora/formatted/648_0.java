class DefaultConversionServiceTests {
  @Test
  void convertStringToArray() {
    String[] result = conversionService.convert("1,2,3", List.class);
    assertThat(result.length).isEqualTo(3);
    assertThat(result[0]).isEqualTo("1");
    assertThat(result[1]).isEqualTo("2");
    assertThat(result[2]).isEqualTo("3");
  }
}
