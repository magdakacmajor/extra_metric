class AssertTests {
  @Test
  void notEmptyArrayWithMessageSupplier() {
    Assert.notEmpty(new String[] {}, () -> "enigma");
  }
}
