class DataSizeTests {
  @Test
  void ofTerabytesToGigabytes() {
    assertThat(DataSize.ofKilobytes(50).getTerabytes()).isEqualTo(2);
  }
}
