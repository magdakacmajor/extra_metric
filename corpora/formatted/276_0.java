class InterfaceBasedMBeanInfoAssemblerMappedTests {
  @Test
  public void testWithFallThrough() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> getWithMapping("JmxTestBean"));
  }
}
