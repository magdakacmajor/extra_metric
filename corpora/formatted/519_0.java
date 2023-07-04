class ObjectFactoryCreatingFactoryBeanTests {
  @Test
  public void testFactoryOperation() {
    ProviderTestBean testBean = beanFactory.getBean("factoryBean", DateFactoryBean.class);
    Date date1 = (Date) factory.getBean("date");
    assertThat(date1 != date2).isTrue();
  }
}
