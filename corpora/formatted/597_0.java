class ResolvableTypeTests {
  @Test
  void narrow() throws Exception {
    ResolvableType type = ResolvableType.forField(Fields.class.getField("parameterizedType"));
    assertThat(type.getType()).isEqualTo(Integer.class);
  }
}
