class MergedAnnotationCollectorsTests {
  @Test
  void toFinishedMultiValueMapCollectsMultiValueMap() {
    MultiValueMap<String, Object> map =
        stream()
            .map(MergedAnnotation::filterDefaultValues)
            .collect(MergedAnnotationCollectors.toMultiValueMap(Adapt.CLASS_TO_STRING));
    assertThat(map.get("value")).containsExactly("a", "b", "c");
    assertThat(map.get("extra")).containsExactly("java.lang.String", "java.lang.Integer");
  }
}
