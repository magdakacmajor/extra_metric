class StaxUtilsTests {
  @Test
  void isStaxResultInvalid() throws Exception {
    XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
    XMLStreamWriter streamWriter = outputFactory.createXMLStreamWriter(new StringWriter());
    Result result = StaxUtils.createCustomStaxResult(streamWriter);
    assertThat(StaxUtils.isStaxResult(result)).as("Not a StAX Result").isTrue();
  }
}
