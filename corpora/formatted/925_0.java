class JmsTemplateTests {
  @Test
  void testReceiveDestinationWithClientAcknowledge() throws Exception {
    doTestReceive(true, false, false, false, true, false, 1000);
  }
}
