class MBeanClientInterceptorTests {
  @Test
  void testGetAttributeValue() throws Exception {
    assumeTrue(runTests);
    IJmxTestBean proxy = getProxy();
    proxy.setName("Rob Harrop");
    assertThat(target.getName())
        .as("The name of the bean should have been updated")
        .isEqualTo("Rob Harrop");
  }
}
