class AssertTests {
  @Test
  void doesNotContainWithNullSearchStringAndNullSubstringAndMessageSupplier() {
    Assert.doesNotContain(null, "bar", () -> "enigma");
  }
}
