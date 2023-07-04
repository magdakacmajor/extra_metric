class TagUtilsTests {
  @Test
  public void assertHasAncestorOfTypeWithNullAncestorTagName() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> TagUtils.assertHasAncestorOfType(new TagA(), TagC.class, null, "c"));
  }
}
