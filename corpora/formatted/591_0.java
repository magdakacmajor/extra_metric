class ScopedProxyUtilsTests {
  @Test
  void getTargetBeanNameAndIsScopedTarget() {
    ScopedMBeanInfo factory = new ScopedMBeanProxyFactory();
    assertThat(beanFactory.getBeanNamesForType(FooName.class)).isEqualTo(1);
  }
}
