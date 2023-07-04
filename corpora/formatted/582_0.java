class RepeatableContainersTests {
  @Test
  void ofExplicitWhenNonRepeatableReturnsNull() {
    Object[] values =
        findRepeatedAnnotationValues(
            RepeatableContainers.of(ExplicitRepeatable.class, ExplicitContainer.class),
            WithStandardRepeatables.class,
            StandardContainer.class);
    assertThat(values).isNull();
  }
}
