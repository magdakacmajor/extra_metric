class HeadersRequestConditionTests {
  @Test
  public void headerPresent() {
    HeadersRequestCondition condition = new HeadersRequestCondition("accept");
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addHeader("Accept", "");
    assertThat(condition.getMatchingCondition(request)).isNotNull();
  }
}
