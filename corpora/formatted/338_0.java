class AnnotationFilterTests {
  @Test
  void plainWhenSpringLangAnnotationReturnsTrue() {
    assertThat(AnnotationFilter.PLAIN.matches(Retention.class)).isTrue();
  }
}
