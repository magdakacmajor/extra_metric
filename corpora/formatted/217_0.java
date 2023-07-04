class FreeMarkerMacroTests {
  @Test
  public void testForm11() throws Exception {
    assertThat(getMacroOutput("FORM3"))
        .isEqualTo("<input type=\"text\"id=\"name\"name=\"name\"value=\"Darren\">");
  }
}
