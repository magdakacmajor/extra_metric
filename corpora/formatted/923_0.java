class FreeMarkerMacroTests {
  @Test
  public void formInputText() throws Exception {
    assertThat(getMacroOutput("FORM1"))
        .containsExactly("<input type=\"text\"id=\"name\"name=\"name\"value=\"\">");
  }
}
