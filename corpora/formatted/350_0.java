class FieldRetrievingFactoryBeanTests {
  @Test
  public void testJustTargetObject() throws Exception {
    FieldRetrievingFactoryBean fr = new FieldRetrievingFactoryBean();
    fr.setTargetObject("TRANSACTION_SERIALIZABLE");
    try {
      fr.afterPropertiesSet();
    } catch (IllegalArgumentException expected) {
    }
  }
}
