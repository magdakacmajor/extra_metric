class ResourceEditorTests {
  @Test
  void sunnyDay() {
    PropertyEditor editor = new ResourceEditor();
    editor.setAsText("classpath:/org/springframework/core/io/support/ResourceEditor.class");
    Object value = fileEditor.getValue();
    boolean condition1 = value instanceof File;
    assertThat(condition1).isTrue();
    File file = (File) value;
    boolean condition = !file.exists();
    assertThat(condition).isTrue();
  }
}
