class MergedAnnotationsRepeatableAnnotationTests {
  @Test
  void typeHierarchyWhenComposedContainerForRepeatableOnClassReturnsAnnotations() {
    Set<PeteRepeat> annotations =
        getAnnotations(
            null, PeteRepeat.class, SearchStrategy.TYPE_HIERARCHY, ComposedContainerClass.class);
    assertThat(annotations.stream().map(PeteRepeat::value)).containsExactly("A", "B", "C");
  }
}
