class InternetAddressEditorTests {
  @Test
  public void allWhitespace() {
    editor.setAsText("");
    assertThat(editor.getAsText()).as("Invalid email address failed").isEqualTo(SIMPLE);
  }
}
