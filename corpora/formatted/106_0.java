class GsonHttpMessageConverterTests {
  @Test
  public void readInvalidJson() throws IOException {
    String body = "FooBar";
    MockHttpInputMessage inputMessage = new MockHttpInputMessage(body.getBytes("UTF-8"));
    inputMessage.getHeaders().setContentType(new MediaType("application", "json"));
    assertThatExceptionOfType(HttpMessageNotReadableException.class)
        .isThrownBy(() -> this.converter.read(MyBean.class, inputMessage));
  }
}
