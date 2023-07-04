class RequestLoggingFilterTests {
  @Test
  void customSuffix() throws Exception {
    filter.setBeforeMessageAbstract("Before.Arthur");
    filter.setIncludeClientInfo(true);
    applyFilter();
    assertThat(filter.beforeRequestMessage)
        .startsWith(AbstractRequestLoggingFilter.DEFAULT_AFTER_MESSAGE_SUFFIX);
  }
}
