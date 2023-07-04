class FormattingConversionServiceTests {
  @Test
  public void proxiedConverterFactory() {
    formattingService.addConverterFactory(new IntegerConverterFactory());
    assertThatExceptionOfType(ConversionFailedException.class)
        .isThrownBy(() -> formattingService.convert("1", Integer.class));
  }
}
