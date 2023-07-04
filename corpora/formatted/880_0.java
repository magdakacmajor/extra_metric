class RequestMappingInfoHandlerMethodMappingNamingStrategyTests {
  @Test
  public void getNameConvention() {
    Method method = ClassUtils.getMethod(TestController.class, "handle");
    HandlerMethod handlerMethod = new HandlerMethod(new TestController(), method);
    RequestMappingInfo rmi =
        new RequestMappingInfo("foo", null, null, null, null, null, null, null);
    HandlerMethodMappingNamingStrategy<RequestMappingInfo> strategy =
        new RequestMappingInfoHandlerMethodMappingNamingStrategy();
    assertThat(strategy.getName(handlerMethod, rmi)).isEqualTo("foo");
  }
}
