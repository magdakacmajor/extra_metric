class AnnotationMetadataTests {
  @Test
  void metaAnnotationOverridesUsingAnnotationMetadataReadingVisitor() throws Exception {
    AnnotationMetadata metadata =
        new StandardAnnotationMetadata(ComposedConfigurationWithAttributeOverridesClass.class);
    assertMetaAnnotationOverrides(metadata);
  }
}
