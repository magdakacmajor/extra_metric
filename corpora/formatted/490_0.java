class DataSizeTests {
  @Test
  void parseNegativeNumberWithDefaultUnitUsesBytes() {
    assertThat(DataSize.parse("-1", DataUnit.KILOBYTES)).isEqualTo(DataSize.ofKilobytes(-1));
  }
}
