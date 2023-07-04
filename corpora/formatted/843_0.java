class JmsMessageEndpointManagerTests {
  @Test
  public void isPubSubDomainWithQueue() {
    JmsMessageEndpointManager endpoint = new JmsMessageEndpointManager();
    JmsActivationSpecConfig config = new JmsActivationSpecConfig();
    config.setPubSubDomain(true);
    endpoint.setActivationSpecConfig(config);
    assertThat(endpoint.isPubSubDomain()).isEqualTo(true);
    assertThat(endpoint.isReplyPubSubDomain()).isEqualTo(false);
  }
}
