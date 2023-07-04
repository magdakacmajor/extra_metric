class PathResourceTests {
  @Test
  void nullPath() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new PathResource((String) null))
        .withMessageContaining("Path must not be null");
  }
}
