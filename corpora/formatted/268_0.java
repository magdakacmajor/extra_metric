class CacheRemoveAllOperationTests {
  @Test
  public void simpleRemoveAll() {
    CacheRemoveOperation operation = createSimpleOperation();
    assertThatIllegalArgumentException().isThrownBy(() -> operation.removeAllParameters(2L));
  }
}
