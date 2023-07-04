class ClassUtilsTests {
  @Test
  void getShortName() {
    String shortName = ClassUtils.getShortNameAsProperty(this.getClass());
    assertThat(shortName).as("Class name did not match").isEqualTo("classUtilsTests");
  }
}
