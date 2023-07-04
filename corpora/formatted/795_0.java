class XmlBeanConfigurerTests {
  @Test
  public void injection() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(AUTOWIRE_CONTEXT);
    TestBean bean = (TestBean) this.ctx.getBean("defaultTestBean");
    assertThat(bean.getTouchy()).isEqualTo("spouse.xml");
  }
}
