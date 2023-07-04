class JmsTemplateTests {
  @Test
  void testReceiveAndConvertDestination() throws Exception {
    doTestReceive(
        true, false, true, false, false, true, JmsTemplate.RECEIVE_TIMEOUT_INDEFINITE_WAIT);
  }
}
