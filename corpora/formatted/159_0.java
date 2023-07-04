class FormattingConversionServiceTests {
  @Test
  public void parseEmptyString() {
    assertThat(
            formattingService.convert(
                "", TypeDescriptor.valueOf(String.class), TypeDescriptor.valueOf(Integer.class)))
        .isNull();
  }
}
