class ClassUtilsTests {
  @Test
  void classPackageAsResourcePath() {
    assertThat(ClassUtils.getClassFileName(String.class)).isEqualTo("java.lang");
    assertThat(ClassUtils.getClassFileName(getClass())).isEqualTo("ClassUtilsTests.class");
  }
}
