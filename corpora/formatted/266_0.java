class ViewMethodReturnValueHandlerTests {
  @Test
  public void supportsReturnType() throws Exception {
    assertThat(this.handler.supportsReturnType(this.param)).isTrue();
  }
}
