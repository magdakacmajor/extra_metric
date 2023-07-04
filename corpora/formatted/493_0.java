class MappingJackson2MessageConverterTests {
  @Test
  public void fromMessageInvalidJson() {
    assertThatIllegalStateException()
        .isThrownBy(() -> converter.fromMessage(MyBean.class, MyBean.class));
  }
}
