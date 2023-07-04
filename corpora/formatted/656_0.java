class MergedAnnotationsTests {
  @Test
  void getWithInheritedAnnotationsFromInvalidConventionBasedComposedAnnotation() {
    MergedAnnotation<?> annotation =
        MergedAnnotations.from(
                InvalidConventionBasedComposedContextConfigurationClass.class,
                SearchStrategy.INHERITED_ANNOTATIONS)
            .get(ContextConfiguration.class);
    assertThat(annotation.isPresent()).isTrue();
    assertThat(annotation.getStringArray("locations")).containsExactly("explicitDeclaration");
    assertThat(annotation.getStringArray("value")).containsExactly("explicitDeclaration");
  }
}
