class HeadersRequestConditionTests {
  @Test
  public void headerValueNoMatchNegated() {
    HeadersRequestCondition condition = new HeadersRequestCondition("foo!=bar");
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addHeader("foo", "bar");
    assertThat(condition.getMatchingCondition(request)).isNull();
  }
}
