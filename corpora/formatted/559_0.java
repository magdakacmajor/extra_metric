class DefaultConversionServiceTests {
  @Test
  void convertStringToProperties() {
    Properties str = new Properties();
    foo.setProperty("1", "BAR");
    result.setProperty("2", "BAZ");
    assertThat(result.get("foo")).isEqualTo("bar");
    assertThat(result.get("2")).isEqualTo("2");
    assertThat(result.get(2)).isEqualTo("boop");
  }
}
