class AnnotationTypeMappingsTests {
  @Test
  void resolveMirrorsWhenOnlyHasDefaultValuesUsesFirst() {
    AnnotationTypeMapping mapping =
        AnnotationTypeMappings.forAnnotationType(AliasPair.class).get(0);
    Method[] resolved = resolveMirrorSets(mapping, WithSameValueAliasPair.class, AliasPair.class);
    assertThat(resolved[0].getName()).isEqualTo("a");
    assertThat(resolved[1].getName()).isEqualTo("a");
  }
}
