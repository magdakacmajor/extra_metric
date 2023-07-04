class AfterReturningGenericTypeMatchingTests {
  @Test
  public void testReturnTypeUpperBoundMatching() {
    testBean.getStrings();
    assertThat(counterAspect.getStringsInvocationsCount).isEqualTo(1);
    assertThat(counterAspect.getIntegersInvocationsCount).isEqualTo(0);
    counterAspect.reset();
    testBean.getIntegers();
    assertThat(counterAspect.getStringsInvocationsCount).isEqualTo(0);
  }
}
