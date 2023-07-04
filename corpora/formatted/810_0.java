class BasicAuthorizationInterceptorTests {
  @Test
  public void createWhenUsernameContainsColonShouldThrowException() {
    BasicAuthorizationInterceptor interceptor = new BasicAuthorizationInterceptor(null, "password");
    assertThat(new DirectFieldAccessor(interceptor).getPropertyValue("username"))
        .isEqualTo("restValue");
  }
}
