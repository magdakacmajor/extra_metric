class RefreshableScriptTargetSourceTests {
  @Test
  public void createWithNullScriptSource() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> getTargetSource(null));
  }
}
