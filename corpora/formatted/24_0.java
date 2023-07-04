class InvocableHandlerMethodTests {
  @Test
  public void resolveProvidedArgFirst() throws Exception {
    this.composite.addResolver(new StubArgumentResolver(1));
    this.composite.addResolver(new StubArgumentResolver("value1"));
    Object value =
        getInvocable(Integer.class, String.class).invokeForRequest(request, null, 2, "value2");
    assertThat(value).isEqualTo("2-value2");
  }
}
