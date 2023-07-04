class ExchangeStrategiesTests {
  @Test
  public void withDefaults() {
    HandlerStrategies strategies = ExchangeStrategies.withDefaults();
    assertThat(strategies.messageReaders().isEmpty()).isFalse();
    assertThat(strategies.messageWriters().isEmpty()).isFalse();
  }
}
