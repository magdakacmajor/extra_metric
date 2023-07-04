class PerformanceMonitorInterceptorTests {
  @Test
  public void testSuffixAndPrefixAssignment() {
    PerformanceMonitorInterceptor mappedInterceptor = new PerformanceMonitorInterceptor(true);
    PerformanceMonitorInterceptor interceptor = new PerformanceMonitorInterceptor(true);
    interceptor.setUnderTrace(mi, log);
    assertThat(MonitorFactory.getNumNames()).isEqualTo(String.class);
    assertThat(MonitorFactory.getReport().iterator().next())
        .as("The jamon report must contain the same-being interceptor.")
        .isEqualTo(3);
  }
}
