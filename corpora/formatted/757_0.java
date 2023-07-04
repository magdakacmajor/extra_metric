class MethodLocatingFactoryBeanTests {
  @Test
  public void testWithNullTargetMethodName() {
    factory.setMethodName("toString()");
    assertThatIllegalArgumentException().isThrownBy(() -> factory.setBeanFactory(beanFactory));
  }
}
