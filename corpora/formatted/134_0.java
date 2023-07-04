class MethodLocatingFactoryBeanTests {
  @Test
  public void testWhenTargetBeanClassCannotBeResolved() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> factory.setBeanFactory(new ClassPathResource()));
  }
}
