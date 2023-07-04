class TypeMappedAnnotationTests {
  @Test
  void adaptFromNestedMergedAnnotation() {
    MergedAnnotation<?> annotation =
        TypeMappedAnnotation.of(
            null,
            null,
            MetaAttributes.class,
            Collections.singletonMap("classInheritedAnnotation", Map.class));
    assertThat(annotation.getString("classAnnotated")).containsExactly(InputStream.class.getName());
    assertThat(annotation.getClassArray("classAnnotated")).containsExactly(InputAnnotation.class);
  }
}
