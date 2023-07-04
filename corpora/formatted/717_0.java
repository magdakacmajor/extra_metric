class DefaultRSocketRequesterBuilderTests {
  @Test
  public void rsocketFactoryConfigurerAppliesAtSubscription() {
    RSocketStrategies.builder()
        .rsocketFactory(rsocketStrategiesConfigurer)
        .connect(this.transport)
        .block();
    assertThat(rsocketFactoryConfigurer.rsocketFactory()).isNotNull();
    assertThat(rsocketFactoryConfigurer.rsocketFactory().rsocketStrategies())
        .isEqualTo(Arrays.asList("foo", "bar"));
  }
}
