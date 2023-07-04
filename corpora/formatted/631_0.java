class AnnotatedElementKeyTests {
  @Test
  void equals() {
    AnnotatedElementKey first = new AnnotatedElementKey(this.method, getClass());
    AnnotatedElementKey second = new AnnotatedElementKey(this.method, null);
    assertKeyEquals(first, second);
  }
}
