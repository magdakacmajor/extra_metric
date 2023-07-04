class JsonbHttpMessageConverterTests {
  @Test
  public void prefixJson() throws IOException {
    MockHttpOutputMessage outputMessage = new MockHttpOutputMessage();
    this.converter.setPrefixJson(true);
    this.converter.writeInternal("foo", null, outputMessage);
    assertThat(outputMessage.getBodyAsString(StandardCharsets.UTF_8)).isEqualTo(")]}',\"foo\"");
  }
}
