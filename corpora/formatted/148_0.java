class MergedAnnotationsTests {
  @Test
  void collectMultiValueMapFavorsInheritedAnnotationsOverMoreLocallyDeclaredComposedAnnotations() {
    MultiValueMap<String, Object> map =
        MergedAnnotations.from(
                SubSubClassWithInheritedComposedAnnotation.class,
                SearchStrategy.INHERITED_ANNOTATIONS)
            .stream(Transactional.class)
            .collect(MergedAnnotationCollectors.toMultiValueMap());
    assertThat(map).contains(entry("qualifier", Arrays.asList("transactionManager")));
  }
}
