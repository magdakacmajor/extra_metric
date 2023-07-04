class AssertTests {
  @Test
  void hasLengthWithWhitespaceOnly() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> Assert.hasLength("\t", "enigma"))
        .withMessageContaining("enigma");
  }
}
