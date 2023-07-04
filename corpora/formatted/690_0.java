class ManagedListTests {
  @Test
  public void mergeEmptyChild() {
    ManagedList parent = new ManagedList();
    parent.add("one");
    parent.add("two");
    ManagedList child = new ManagedList();
    child.setMergeEnabled(true);
    List mergedList = child.merge(parent);
    assertThat(mergedList.size()).as("merge()obviously did not work.").isEqualTo(2);
  }
}
