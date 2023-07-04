class PackagesAnnotationFilterTests {
  @Test
  void createWhenPackagesContainsEmptyTextThrowsException() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new PackagesAnnotationFilter((String) null))
        .withMessage("Packages array must not have empty elements");
  }
}
