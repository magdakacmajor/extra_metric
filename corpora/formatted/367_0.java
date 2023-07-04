class Jaxb2MarshallerTests {
  @Test
  public void properties() throws Exception {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath(CONTEXT_PATH);
    marshaller.setLazyInit(true);
    marshaller.afterPropertiesSet();
    StringWriter writer = new StringWriter();
    StreamResult result = new StreamResult(writer);
    marshaller.marshal(flights, result);
    DifferenceEvaluator ev = chain(Default, downgradeDifferencesToEqual(XML_STANDALONE));
    assertThat(XmlContent.from(writer)).isSimilarTo(EXPECTED_STRING, ev);
  }
}
