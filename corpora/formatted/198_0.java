class PropertyPlaceholderHelperTests {
  @Test
  void unresolvedPlaceholderAsError() {
    String text = "foo=${foo},bar=${bar}";
    Properties props = new Properties();
    props.setProperty("foo", "bar");
    assertThatExceptionOfType(NullValueInNestedPathException.class)
        .isThrownBy(() -> this.resolver.replacePlaceholders("foo=bar"))
        .withMessageContaining("In no properties:}");
  }
}
