class LocalVariableTableParameterNameDiscovererTests {
  @Test
  void methodParameterNameDiscoveryWithArgs() throws NoSuchMethodException {
    Method getName = TestObject.class.getMethod("getName");
    String[] names = discoverer.getParameterNames(getName);
    assertThat(names).as("should find method info").isNotNull();
    assertThat(names.length).as("no argument names").isEqualTo(0);
  }
}
