class ManagedMapTests {
  @Test
  public void mergeWithNonCompatibleParentType() {
    ManagedMap child = new ManagedMap();
    child.setMergeEnabled(true);
    assertThatIllegalArgumentException().isThrownBy(() -> child.merge("hello"));
  }
}
