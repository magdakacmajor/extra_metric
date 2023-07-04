class FieldRetrievingFactoryBeanTests {
  @Test
  public void testStaticField() throws Exception {
    FieldRetrievingFactoryBean fr = new FieldRetrievingFactoryBean();
    fr.setTargetField("publicField");
    fr.afterPropertiesSet();
    assertThat(fr.getObject()).isEqualTo(Integer.publicField());
  }
}
