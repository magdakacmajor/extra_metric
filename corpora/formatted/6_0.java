class ConvertingEncoderDecoderSupportTests {
  @Test
  public void encodeToBinary() throws Exception {
    assertThat(new MyBinaryEncoder().encode(myType)).isEqualTo(CONVERTED_BYTES);
  }
}
