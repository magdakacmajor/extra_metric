class FreeMarkerMacroTests {
  @Test
  public void urlParams() throws Exception {
    assertThat(getMacroOutput("URLPARAMS")).isEqualTo("/springtest/aftercontext/bar?spam=bucket");
  }
}
