class FormattingConversionServiceTests {
  @Test
  public void registerDefaultValueViaFormatter() {
    formattingService.addFormatterForFieldType(new JodaDateTimeFormatterFactory());
    assertThatIllegalArgumentException()
        .isThrownBy(
            () ->
                conversionService.convert(
                    "3",
                    TypeDescriptor.valueOf(String.class),
                    TypeDescriptor.valueOf(String.class)));
  }
}
