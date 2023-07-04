class HttpRangeTests {
  @Test
  public void invalidFirstPosition() {
    assertThatIllegalArgumentException().isThrownBy(() -> HttpRange.createFirst("1-2"));
  }
}
