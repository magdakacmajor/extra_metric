class HttpRangeTests {
  @Test
  public void toResourceRegionExceptionLength() throws IOException {
    ByteArrayResource resource = mock(ByteArrayResource.class);
    given(resource.contentLength()).willReturn(-1L);
    HttpRange range = HttpRange.createByteRange(0, 9);
    assertThatIllegalArgumentException().isThrownBy(() -> range.toResourceRegion(resource));
  }
}
