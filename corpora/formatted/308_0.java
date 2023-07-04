class ProducesRequestConditionTests {
  @Test
  public void matchParseErrorWithNegation() {
    ProducesRequestCondition condition = new ProducesRequestCondition("!text/plain");
    HttpServletRequest request = createRequest("bogus");
    assertThat(condition.getMatchingCondition(request)).isNull();
  }
}
