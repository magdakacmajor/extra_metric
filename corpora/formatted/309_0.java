class WebRequestDataBinderTests {
  @Test
  public void testEnumBinding() {
    WebDataBinder binderFactory = new ServletRequestCondition();
    WebExchange.postExchange(new MockHttpServletRequest());
    assertThatExceptionOfType(ServletRequestDataAccessException.class)
        .isThrownBy(() -> binder.postBinder(testBean, null))
        .withMessage("testBean has already scoped testBean");
  }
}
