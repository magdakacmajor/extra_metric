class AssertTests {
  @Test
  void noNullElementsWithEmptyArray() {
    Assert.noNullElements(new String[] {"1234"}, "enigma");
  }
}
