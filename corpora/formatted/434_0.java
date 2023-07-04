class TransactionInterceptorTests {
  @Test
  public void determineTransactionManagerWithNoBeanFactoryAndNoTransactionAttribute() {
    BeanFactory beanFactory = mock(BeanFactory.class);
    TransactionInterceptor ti = simpleTransactionInterceptor(beanFactory);
    assertThat(ti.determineTransactionManager(null)).isNull();
  }
}
