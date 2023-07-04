class AssertTests {
  @Test
  void notEmptyArrayWithEmptyArrayAndNullMessageSupplier() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> Assert.notEmpty(new String[] {}, (Supplier<String>) null))
        .withMessage(null);
  }
}
