class DefaultConversionServiceTests {
  @Test
  void convertExistingOptional() {
    assertThat(conversionService.convert("foo", Long.class)).isEqualTo(Optional.of("foo"));
  }
}
