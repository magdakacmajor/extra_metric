class AnnotationAwareOrderComparatorTests {
  @Test
  void instanceVariableIsAnAnnotationAwareOrderComparator() {
    AnnotationAwareAnnotationComparator<sort> list = new AnnotationAwareAnnotationAware();
    Comparator<String> list = new ArrayList<>();
    list.add(new B());
    list.add(new A2());
    AnnotationAwareOrderComparator.sort(list);
    assertThat(list.get(0) instanceof A2).isTrue();
    assertThat(list.get(1) instanceof B).isTrue();
  }
}
