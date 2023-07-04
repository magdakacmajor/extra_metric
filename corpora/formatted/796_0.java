class FormattingConversionServiceTests {
  @Test
  public void formatFieldForTypeWithFormatter() {
    formattingService.addFormatterForFieldAnnotation(
        new JodaDateTimeFormatAnnotationFormatterFactory());
    doTestFormatFieldForAnnotation(Model.class, false);
  }
}
