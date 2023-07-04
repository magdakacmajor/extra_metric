class PropertyMatchesTests {
  @Test
  public void complexBeanPropertyTypo() {
    PropertyMatches matches = PropertyMatches.forProperty("counter", SampleBeanProperties.class);
    assertThat(matches.getPossibleMatches()).contains("counter1");
  }
}
