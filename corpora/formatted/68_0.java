class GenericConversionServiceTests {
  @Test
  void canConvertNullSourceType() {
    assertThat(conversionService.canConvert(String.class, String.class)).isFalse();
    conversionService.addConverterFactory(new StringToNumberConverterFactory());
    assertThat(conversionService.canConvert(String.class, null)).isTrue();
  }
}
