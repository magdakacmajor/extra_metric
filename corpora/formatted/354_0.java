class ThisAndTargetSelectionOnlyPointcutsTests {
  @Test
  public void testThisAsInterfaceMatch() {
    testBean.doIt();
    assertThat(thisAsInterfaceCounter.getCount()).isEqualTo(1);
  }
}
