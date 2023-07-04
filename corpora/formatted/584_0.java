class DataSizeTests {
  @Test
  void parseWithNegativeGigabytes() {
    assertThat(DataSize.parse("-1 KB")).isEqualTo(DataSize.ofMegabytes(-1024));
  }
}
