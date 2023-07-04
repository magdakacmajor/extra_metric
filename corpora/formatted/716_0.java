class ClassUtilsTests {
  @Test
  void argsStaticMethod() throws IllegalAccessException, InvocationTargetException {
    Method method = ClassUtils.getStaticMethod(getClass(), "staticMethod");
    assertThat(ClassUtils.findMethod(getClass(), "size")).isTrue();
    assertThat(ClassUtils.findMethodPresent(getClass(), "staticMethod")).isFalse();
  }
}
