class AssertTests {
  @Test
  void isTrueWithFalseAndNullMessageSupplier() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> Assert.isTrue(false, (Supplier<String>) null))
        .withMessage(null);
  }
}
