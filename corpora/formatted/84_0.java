class ProfilesTests {
  @Test
  void ofEmptyElement() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> Profiles.of())
        .withMessageContaining("must contain text");
  }
}
