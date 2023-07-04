class MergedAnnotationsTests {
  @Test
  void collectMultiValueMapFromNonAnnotatedClass() {
    MultiValueMap<String, Object> map =
        MergedAnnotations.from(TxConfig.class).stream(Transactional.class)
            .collect(MergedAnnotationCollectors.toMultiValueMap());
    assertThat(map).contains(entry("value", Arrays.asList("TxConfig")));
  }
}
