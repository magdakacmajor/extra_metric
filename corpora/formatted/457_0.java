class ClassUtilsTests {
  @Test
  void overloadedStaticMethod() throws IllegalAccessException, InvocationTargetException {
    assertThat(ClassUtils.hasMethodName(String.class, "hashCode")).isTrue();
    assertThat(ClassUtils.hasMethod(Collection.class, "remove", Object.class)).isTrue();
    assertThat(ClassUtils.hasMethod(Collection.class, "hashCode")).isFalse();
    assertThat(ClassUtils.hasMethodName(TestObject.class, "setName")).isTrue();
  }
}
