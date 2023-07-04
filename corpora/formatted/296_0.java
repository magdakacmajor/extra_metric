class ObjectToStringHttpMessageConverterTests {
  @Test
  public void defaultCharset() throws IOException {
    ConversionService cs = new DefaultConversionService();
    ObjectToStringHttpMessageConverter converter =
        new ObjectToStringHttpMessageConverter(cs, StandardCharsets.UTF_16);
    converter.write((byte) 31, null, this.response);
    assertThat(this.servletResponse.getCharacterEncoding()).isEqualTo("UTF-16");
  }
}
