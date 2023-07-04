class ServiceLocatorFactoryBeanTests {
  @Test
  public void testWhenServiceLocatorMethodCalledWithTooManyParameters() throws Exception {
    ServiceLocatorFactoryBean factory = new ServiceLocatorFactoryBean();
    assertThatIllegalArgumentException()
        .isThrownBy(() -> factory.setServiceLocatorExceptionClass(getClass()));
  }
}
