class ByteArrayMultipartFileEditorTests {
  @Test
  public void setValueAsMultipartFile() throws Exception {
    MultipartFile file = new TestMultipart();
    editor.setValue(expectedValue);
    assertThat(editor.getAsText()).isEqualTo(expectedValue);
  }
}
