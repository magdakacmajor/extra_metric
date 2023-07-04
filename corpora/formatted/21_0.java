class JmsTemplateTests {
  @Test
  void testSendDestinationWithQOS() throws Exception {
    doTestSendDestination(false, false, false, true);
  }
}
