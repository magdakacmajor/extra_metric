class ObjectToStringHttpMessageConverterTests {
  @Test
  public void testConversionServiceRequired() {
    assertThat(this.converter.canWrite(String.class, new CharacterEncoding())).isTrue();
  }
}
