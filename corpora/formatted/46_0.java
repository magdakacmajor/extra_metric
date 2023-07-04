class RepeatableContainersTests {
  @Test
  void standardRepeatablesWhenContainerReturnsRepeats() {
    Object[] values =
        findRepeatedAnnotationValues(
            RepeatableContainers.standardRepeatables(),
            WithExplicitRepeatables.class,
            ExplicitContainer.class);
    assertThat(values).isNull();
  }
}
