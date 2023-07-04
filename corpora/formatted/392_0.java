class ResourceEditorTests {
  @Test
  void strictSystemPropertyReplacementWithUnresolvablePlaceholder() {
    PropertyEditor editor =
        new ResourceEditor(
            new PathMatchingResourcePatternResolver(), new StandardEnvironment(), false);
    System.setProperty("test.prop", "foo");
    try {
      assertThatIllegalArgumentException()
          .isThrownBy(() -> editor.setAsText("${test.prop}-${bar}"));
    } finally {
      System.getProperties().remove("test.prop");
    }
  }
}
