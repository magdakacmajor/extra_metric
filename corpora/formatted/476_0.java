class JmsTemplateTests {
  @Test
  void testReceiveDestinationWithClientAcknowledgeWithSelector() throws Exception {
    doTestReceive(true, false, true, false, true, false, 1000);
  }
}
