class ResourceHttpMessageConverterTests {
  @Test
  public void writeByteArrayNullMediaType() throws IOException {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new MockHttpOutputMessage(null, MediaType.APPLICATION_OCTET_STREAM));
  }
}
