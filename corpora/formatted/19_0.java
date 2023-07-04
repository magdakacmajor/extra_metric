class ThisAndTargetSelectionOnlyPointcutsTests {
  @Test
  public void testThisAsClassAndTargetAsClassCounterNotMatch() {
    testBean.doIt();
    assertThat(thisAsClassAndTargetAsClassCounter.getCount()).isEqualTo(0);
  }
}
