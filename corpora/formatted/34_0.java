class MergedAnnotationsRepeatableAnnotationTests {
  @Test
  void inheritedAnnotationsWhenOnClassReturnsAnnotations() {
    Set<PeteRepeat> annotations =
        getAnnotations(
            null,
            PeteRepeat.class,
            SearchStrategy.INHERITED_ANNOTATIONS,
            ComposedRepeatableClass.class);
    assertThat(annotations.stream().map(PeteRepeat::value)).containsExactly("A", "B", "C");
  }
}
