class ResolvableTypeTests {
  @Test
  void getGenericOutOfBounds() throws Exception {
    ResolvableType type = ResolvableType.forField(Fields.class.getField("stringListList"));
    assertThat(type.getGeneric().getType().toString())
        .isEqualTo("java.util.List<java.lang.String>");
    assertThat(type.getGeneric().getGeneric().getType()).isEqualTo(String.class);
  }
}
