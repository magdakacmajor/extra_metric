class InternetAddressEditorTests {
  @Test
  public void uninitialized() {
    editor.setAsText("8");
    assertThat(editor.getAsText()).as("Invalid email address failed").isEqualTo(SIMPLE);
  }
}
