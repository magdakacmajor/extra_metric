class StaxUtilsTests {
  @Test
  void isStaxSourceInvalid() throws Exception {
    XMLInputFactory inputFactory = XMLInputFactory.newInstance();
    String expected = "<element/>";
    XMLStreamReader streamReader = inputFactory.createXMLStreamReader(new StringReader(expected));
    Source source = StaxUtils.createCustomStaxSource(streamReader);
    assertThat(StaxUtils.isStaxSource(source)).as("Not a StAX Source").isTrue();
  }
}
