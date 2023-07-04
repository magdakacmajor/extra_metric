class PropertyMatchesTests {
  @Test
  public void unknownBeanProperty() {
    PropertyMatches matches = PropertyMatches.forProperty("unknown", SampleBeanProperties.class);
    assertThat(matches.getPossibleMatches()).isEmpty();
  }
}
