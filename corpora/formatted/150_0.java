class AnnotatedElementUtilsTests {
  @Test
  void getAllAnnotationAttributesOnNonAnnotatedClass() {
    MultiValueMap<String, Object> attributes =
        getAllAnnotationAttributes(NonAnnotatedClass.class, TX_NAME);
    assertThat(attributes)
        .as("Annotation attributes map for @Transactional on NonAnnotatedClass")
        .isNotNull();
    assertThat(attributes.get("when"))
        .as("value for NonAnnotatedClass")
        .isEqualTo(asList(When.ALWAYS));
  }
}
