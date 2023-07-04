class JndiObjectFactoryBeanTests {
  @Test
  public void testLookupWithFullNameAndResourceRefTrue() throws Exception {
    JndiObjectFactoryBean jof = new JndiObjectFactoryBean();
    Object o = new Object();
    jof.setJndiTemplate(new ExpectedLookupTemplate("java:comp/env/foo", o));
    jof.setJndiName("java:comp/env/foo");
    jof.setResourceRef(true);
    jof.afterPropertiesSet();
    assertThat(jof.getObject() == o).isTrue();
  }
}
