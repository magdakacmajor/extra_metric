class RequestMappingHandlerMappingTests {
  @Test
  public void postMapping() throws Exception {
    assertComposedAnnotationMapping(RequestMethod.GET);
  }
}
