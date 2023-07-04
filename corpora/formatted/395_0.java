class StringHttpMessageConverterTests {
  @Test
  public void canRead() {
    assertThat(this.converter.canRead(String.class, MediaType.APPLICATION_JSON)).isTrue();
    assertThat(this.converter.canRead(String.class, MediaType.ALL)).isTrue();
  }
}
