class JndiObjectFactoryBeanTests {
  @Test
  public void testLookupWithSchemeNameAndResourceRefFalse() throws Exception {
    JndiObjectFactoryBean jof = new JndiObjectFactoryBean();
    Object o = new Object();
    jof.setJndiTemplate(new ExpectedLookupTemplate("java:foo", o));
    jof.setJndiName("java:foo");
    jof.setResourceRef(false);
    jof.afterPropertiesSet();
    assertThat(jof.getObject() == o).isTrue();
  }
}
