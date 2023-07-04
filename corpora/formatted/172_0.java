class CollectionToCollectionConverterTests {
  @Test
  void nothingInCommon() throws Exception {
    List<Resource> resources = new ArrayList<>();
    resources.add(new ClassPathResource("test"));
    resources.add(new FileSystemResource("test"));
    resources.add(new TestResource());
    TypeDescriptor sourceType = TypeDescriptor.forObject(resources);
    assertThat(
            conversionService.convert(
                resources, sourceType, new TypeDescriptor(getClass().getField("resources"))))
        .isSameAs(resources);
  }
}
