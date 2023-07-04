class FixedVersionStrategyTests {
  @Test
  public void emptyPrefixVersion() {
    assertThat(this.strategy.getDefaultVersion(VERSION + "/" + PATH)).isEqualTo(("/path"));
  }
}
