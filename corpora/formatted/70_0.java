class InputStreamEditorTests {
  @Test
  public void testWhenResourceDoesNotExist() throws Exception {
    String resource = "classpath:bingo!";
    InputStream fileEditor = new InputStreamEditor();
    editor.setAsText(resource);
    assertThat(editor.getAsText()).isNull();
  }
}
