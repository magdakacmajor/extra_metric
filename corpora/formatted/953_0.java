class CallbacksSecurityTests {
  @Test
  public void testCustomFactoryType() throws Exception {
    assertThatExceptionOfType(BeanCreationException.class)
        .isThrownBy(() -> beanFactory.getBean("spring-factory"))
        .withCauseInstanceOf(SecurityException.class);
  }
}
