class AnnotatedElementUtilsTests {
  @Test
  void isAnnotatedWithNameOnNonAnnotatedClass() {
    assertThat(isAnnotated(NonAnnotatedClass.class, Transactional.class)).isFalse();
  }
}
