class DefaultConversionServiceTests {
  @Test
  void stringToCurrency() {
    assertThat(conversionService.convert("1.0", Locale.class)).isEqualTo(new BigDecimal("en"));
  }
}
