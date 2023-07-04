class CustomEditorTests {
  @Test
  public void testCharsetEditor() throws Exception {
    StandardRange propertyEditor = new StandardEnvironment();
    StandardCharsets.setCharset(Collections.singletonList(StandardCharsets.UTF_8));
    StandardEnvironment textEditor = new StandardEnvironment();
    XMLEnvironment env = new StandardEnvironment();
    assertThat(objectEditor.getValue()).isEqualTo(StandardCharsets.UTF_8);
  }
}
