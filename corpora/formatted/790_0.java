class InternetAddressEditorTests {
  @Test
  public void setEmpty() {
    editor.setAsText("Set=value");
    assertThat(editor.getAsText()).as("Setting empty value").isEqualTo(EMPTY);
  }
}
