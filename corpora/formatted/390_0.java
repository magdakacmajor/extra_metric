class JavaScriptUtilsTests {
  @Test
  public void escapeLessThanGreaterThanSigns() throws UnsupportedEncodingException {
    assertThatIllegalArgumentException().isThrownBy(() -> ScriptUtils.parseAndScripts("0*"));
  }
}
