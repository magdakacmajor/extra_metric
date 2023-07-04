class FreeMarkerMacroTests {
  @Test
  public void testDefaultTheme() throws Exception {
    assertThat(getMacroOutput("DEFAULTMESSAGE")).isEqualTo("hi planet");
  }
}
