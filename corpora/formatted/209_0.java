class AnnotationTypeMappingsTests {
  @Test
  void forAnnotationTypeWhenAliasForWithIncompatibleReturnTypes() {
    assertThatExceptionOfType(AnnotationConfigurationException.class)
        .isThrownBy(
            () ->
                AnnotationTypeMappings.forAnnotationType(
                    AliasForWithArrayCompatibleReturnTypes.class))
        .withMessage(
            " @AliasFor declaration on attribute'test'in annotation["
                + AliasForWithBothValueAndAttribute.class.getName()
                + "]and attribute'b'in annotation["
                + AliasForWithMissingValueAndTarget.class.getName()
                + "]must declare the same default value.");
  }
}
