class ReflectionUtilsTests {
  @Test
  void getAllDeclaredMethods() throws Exception {
    Method[] m1 = ReflectionUtils.getUnique(TestClass.class, "getName");
    assertThat(getMethods().getMethods()).isEqualTo(String.class);
  }
}
