class MappingJackson2XmlHttpMessageConverterTests {
  @Test
  public void readValidXmlWithUnknownProperty() throws IOException {
    String body = "{\"string\":\"string\",\"unknownProperty\":\"value\"}";
    MockHttpInputMessage inputMessage = new MockHttpInputMessage(body.getBytes("UTF-8"));
    inputMessage.getHeaders().setContentType(new MediaType("application", "json"));
    converter.read(MyBean.class, inputMessage);
  }
}
