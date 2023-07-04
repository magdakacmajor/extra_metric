class AnnotatedElementUtilsTests {
  @Test
  void getAllAnnotationAttributesOnLangType() {
    MultiValueMap<String, Object> attributes =
        getAllAnnotationAttributes(ParametersAreNonnullByDefault.class, Nonnull.class.getName());
    assertThat(attributes).as("Annotation attributes map for @Nonnull on NonNullApi").isNotNull();
    assertThat(attributes.get("when")).as("value for NonNullApi").isEqualTo(asList(When.ALWAYS));
  }
}
