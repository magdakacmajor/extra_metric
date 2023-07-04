class StringHttpMessageConverterTests {
  @Test
  public void read() throws IOException {
    String body = "{\"result\":\"ДА\"}";
    MockHttpInputMessage inputMessage =
        new MockHttpInputMessage(body.getBytes(StandardCharsets.UTF_8));
    inputMessage.getHeaders().setContentType(MediaType.APPLICATION_JSON);
    String result = this.converter.read(String.class, inputMessage);
    assertThat(result).as("Invalid result").isEqualTo(body);
  }
}
