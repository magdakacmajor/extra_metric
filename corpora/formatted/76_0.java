class DataSizeTests {
  @Test
  void parseWithPositiveBytes() {
    assertThat(DataSize.parse("1024 B")).isEqualTo(DataSize.ofKilobytes(1));
  }
}
