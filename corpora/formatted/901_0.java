class StandardEnvironmentTests {
  @Test
  void setDefaultProfiles_withNullProfileArray() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> environment.setDefaultProfiles((String[]) null));
  }
}
