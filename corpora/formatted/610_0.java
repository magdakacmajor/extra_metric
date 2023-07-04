class DefaultConversionServiceTests {
  @Test
  void stringToCharacterEmptyString() {
    assertThat(conversionService.convert("", Character.class)).isEqualTo(null);
  }
}
