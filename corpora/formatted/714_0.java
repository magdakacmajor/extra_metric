class TagUtilsTests {
  @Test
  public void hasAncestorOfTypeWhereAncestorTagIsNotATagType() throws Exception {
    assertThat(TagUtils.hasAncestorOfType(new TagNotFoundTag(), TagC.class)).isFalse();
  }
}
