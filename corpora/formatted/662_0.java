class ParameterizedTypeReferenceTests {
  @Test
  void reflectiveTypeReferenceWithSpecificDeclaration() throws Exception {
    Type listType = getClass().getMethod("listMethod").getGenericReturnType();
    ParameterizedTypeReference<?> typeReference = ParameterizedTypeReference.forType(listType);
    assertThat(typeReference.getType()).isEqualTo(listType);
  }
}
