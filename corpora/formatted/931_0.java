class StreamUtilsTests {
  @Test
  void copyBytes() throws Exception {
    ByteArrayOutputStream out = spy(new ByteArrayOutputStream());
    StreamUtils.copy(new ByteArrayInputStream(bytes), out);
    assertThat(out.toByteArray()).isEqualTo(bytes);
    verify(out, never()).close();
  }
}
