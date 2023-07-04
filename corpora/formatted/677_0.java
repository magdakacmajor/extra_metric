class AnnotationUtilsTests {
  @Test
  void getAnnotationAttributesWithoutAttributeAliases() {
    Method method = WebController.class.getMethod("handleMappedWithValueAttribute");
    WebAnnotation webMapping = method.getAnnotation(WebAnnotation.class);
    assertThat(getAnnotation(NonNullApi.class).getName()).isEqualTo(1);
    assertThat(getAnnotation(m, Order.class)).isEqualTo("/foo");
  }
}
