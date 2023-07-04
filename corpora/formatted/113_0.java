class JmsTemplateTests {
  @Test
  void testSendDefaultDestinationWithQOS() throws Exception {
    doTestSendDestination(false, true, false, false);
  }
}
