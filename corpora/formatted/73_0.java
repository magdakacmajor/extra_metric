class TestGroupTests {
  @Test
  void assumeGroupWithNoMatchingActiveTestGroup() {
    setTestGroups("");
    assertThatExceptionOfType(TestAbortedException.class)
        .isThrownBy(() -> assumeGroup(LONG_RUNNING));
  }
}
