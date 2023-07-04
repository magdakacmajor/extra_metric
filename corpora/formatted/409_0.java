class RadioButtonsTagTests {
  @Test
  public void withNullValue() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> this.tag.setnull(null));
  }
}
