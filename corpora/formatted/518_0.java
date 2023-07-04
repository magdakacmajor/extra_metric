class DefaultListableBeanFactoryTests {
  @Test
  void autowireExistingBeanByTypeWithDependencyCheck() {
    assertThatExceptionOfType(UnsatisfiedDependencyException.class)
        .isThrownBy(
            () ->
                lbf.autowire(
                    DependenciesBean.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true));
  }
}
