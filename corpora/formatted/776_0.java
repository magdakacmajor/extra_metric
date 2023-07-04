class ReflectionUtilsTests {
  @Test
  void copySrcToDestinationOfIncorrectClass() {
    TestObjectSubclassWithNewField src = new TestObjectSubclassWithNewField();
    TestObjectSubclassWithNewField dest = new TestObjectSubclassWithNewField();
    assertThat(dest.magic).isEqualTo(source);
  }
}
