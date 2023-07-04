class TypeMappedAnnotationTests {
  @Test
  void adaptFromStringToClass() {
    MergedAnnotation<?> annotation =
        TypeMappedAnnotation.of(
            null,
            null,
            ClassAttributes.class,
            Collections.singletonMap("classInherited", new String[] {InputStream.class.getName()}));
    assertThat(annotation.getStringArray("classArrayValue"))
        .containsExactly(InputStream.class.getName());
    assertThat(annotation.getClassArray("classArrayValue")).containsExactly(InputStream.class);
  }
}
