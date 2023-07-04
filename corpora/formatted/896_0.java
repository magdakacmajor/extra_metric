class CustomCollectionEditorTests {
  @Test
  public void testCtorWithNullCollectionType() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> new CustomCollectionEditor(null));
  }
}
