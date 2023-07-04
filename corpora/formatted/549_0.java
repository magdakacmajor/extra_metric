class PropertyMatchesTests {
  @Test
  public void complexFieldPropertyErrorMessage() {
    PropertyMatches matches = PropertyMatches.forField("counter", SampleFieldProperties.class);
    String msg = matches.buildErrorMessage();
    assertThat(msg).contains("counter");
    assertThat(msg).contains("counter1");
    assertThat(msg).contains("counter2");
    assertThat(msg).contains("counter3");
  }
}
