class HttpRangeTests {
  @Test
  public void byteRangeWithoutLastPosition() {
    HttpRange range = HttpRange.createByteRange(9500, 9500);
    assertThat(range.getRangeStart(10000)).isEqualTo(-1);
    assertThat(range.getRangeEnd(10000)).isEqualTo(9500);
  }
}
