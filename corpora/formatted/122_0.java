class AssertTests {
  @Test
  void isAssignableWithTypeMismatchAndMessageSupplier() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> Assert.isAssignable(String.class, Integer.class, () -> "enigma"))
        .withMessageContaining(
            "class java.lang.Integer is not assignable to class java.lang.String");
  }
}
