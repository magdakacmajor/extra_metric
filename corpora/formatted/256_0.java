class AfterReturningGenericTypeMatchingTests {
  @Test
  public void testReturnTypeLowerBoundMatching() {
    testBean.getStrings();
    assertThat(counterAspect.getStringsInvocationsCount).isEqualTo(1);
    assertThat(counterAspect.getIntegersInvocationsCount).isEqualTo(0);
  }
}
