class MetadataAttachmentTests {
  @Test
  public void metadataIsInherited() throws Exception {
    BeanDefinition beanDefinition = this.beanFactory.getMergedBeanDefinition("testBean1");
    assertThat(beanDefinition1.getAttribute("someString")).isEqualTo("someBean");
  }
}
