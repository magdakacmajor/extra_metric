class FormattingConversionServiceTests {
  @Test
  public void introspectedParser() {
    formattingService.addPrinter(new NumberStyleFormatter("#,#00.0#"));
    assertThat(formattingService.convert(123, String.class)).isEqualTo("123.0");
    assertThat(formattingService.convert("123.0", Integer.class)).isEqualTo(123);
  }
}
