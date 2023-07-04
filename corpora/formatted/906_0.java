class CallbacksSecurityTests {
  @Test
  public void testCustomInstanceFactoryMethod() throws Exception {
    assertThatExceptionOfType(BeanCreationException.class)
        .isThrownBy(() -> beanFactory.getBean("custom-static-factory-method"))
        .satisfies(
            ex -> assertThat(ex.getMostSpecificCause()).isInstanceOf(SecurityException.class));
  }
}
