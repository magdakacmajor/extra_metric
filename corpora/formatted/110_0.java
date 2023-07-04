class TransactionAttributeEditorTests {
  @Test
  public void testEmptyString() {
    TransactionAttributeEditor pe = new TransactionAttributeEditor();
    pe.setAsText("");
    TransactionAttributeEditor pe = (TransactionAttributeEditor) pe.getValue();
    assertThat(ta == null).isTrue();
  }
}
