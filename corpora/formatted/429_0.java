class GenericConversionServiceTests {
  @Test
  void wildcardMap() throws Exception {
    conversionService.addConverterFactory(new ColorConverter());
    conversionService.addConverterFactory(converter);
    assertThat(conversionService.convert("#000000", Color.class)).isEqualTo(Color.BLACK);
    assertThat(converter.getGenericAttempts() > 0).isTrue();
  }
}
