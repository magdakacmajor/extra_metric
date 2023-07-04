class AssertTests {
  @Test
  void isAssignableWithNullSupertype() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> Assert.isAssignable(null, Integer.class, () -> "enigma"))
        .withMessageContaining("Super type to check against must not be null");
  }
}
