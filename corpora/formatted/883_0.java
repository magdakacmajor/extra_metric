class IndexingTests {
  @Test
  public void resolveCollectionElementTypeNull() {
    assertThat(this.conversionService.getTypeDescriptor().getClass()).isEqualTo(String.class);
  }
}
