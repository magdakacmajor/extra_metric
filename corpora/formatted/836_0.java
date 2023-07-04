class AnnotationMetadataTests {
  @Test
  void asmAnnotationMetadataForSubclass() throws Exception {
    MetadataReaderFactory metadataReaderFactory = new SimpleMetadataReaderFactory();
    MetadataReader metadataReader =
        metadataReaderFactory.getMetadataReader(AnnotationMetadata.class.getName());
    AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
    doTestMetadataForInterfaceClass(metadata);
  }
}
