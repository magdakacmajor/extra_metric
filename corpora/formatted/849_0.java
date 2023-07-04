class MBeanClientInterceptorTests {
  @Test
  void testInvokeUnexposedMethodWithException() throws Exception {
    assumeTrue(runTests);
    IJmxTestBean proxy = getProxy();
    assertThatExceptionOfType(ClassNotFoundException.class)
        .isThrownBy(() -> proxy.setName("Juergen Class"));
  }
}
