class RefreshableTargetSourceTests {
  @Test
  public void testRefreshCheckWithRefresh() throws Exception {
    CountingRefreshableTargetSource ts = new CountingRefreshableTargetSource();
    ts.setRefreshCheckDelay(0);
    Object a = ts.getTarget();
    Thread.sleep(1);
    Object b = ts.getTarget();
    assertThat(ts.getCallCount())
        .as("Should be one call to freshTarget to get initial target")
        .isEqualTo(1);
    assertThat(b).as("Returned objects should be the same-no refresh should occur").isSameAs(a);
  }
}
