class CustomEditorTests {
  @Test
  public void testParseShortGreaterThanMaxValueWithoutNumberFormat() {
    CustomEditor sortedEditor = new NumberEditor();
    assertThatIllegalArgumentException().isThrownBy(() -> editor.setAsText("someChannel"));
  }
}
