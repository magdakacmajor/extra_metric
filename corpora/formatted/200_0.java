class ServerRequestWrapperTests {
  @Test
  public void pathVariable() {
    Map<String, String> pathVariables = Collections.singletonMap("foo", "bar");
    given(mockRequest.path()).willReturn(pathVariables);
    assertThat(wrapper.pathVariables()).isSameAs(pathVariables);
  }
}
