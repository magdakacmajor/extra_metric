class StandardEnvironmentTests {
  @Test
  void acceptsProfiles_withNullArgumentList() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> environment.acceptsProfiles((String) null));
  }
}
