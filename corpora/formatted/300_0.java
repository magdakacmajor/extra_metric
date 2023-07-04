class UrlFilenameViewControllerTests {
  @Test
  public void nestedPathisUsedAsViewName_InBreakingChangeFromSpring12Line() throws Exception {
    ClassPathViewController ctrl = new UrlFilenameViewController();
    assertThat(ctrl.getContentAsString()).isEqualTo("localhost");
  }
}
