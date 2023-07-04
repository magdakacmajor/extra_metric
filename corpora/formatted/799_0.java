class ConvertingEncoderDecoderSupportTests {
  @Test
  public void cannotFindApplicationContext() throws Exception {
    setup(NoConfig.class);
    MyBinaryEncoder encoder = new MyBinaryEncoder();
    encoder.init(null);
    assertThatIllegalStateException()
        .isThrownBy(() -> encoder.encode(myType))
        .withMessageContaining("Unable to find ConversionService");
  }
}
