class ScriptFactoryPostProcessorTests {
  @Test
  public void testDoesNothingWhenPostProcessingNonScriptFactoryTypeBeforeInstantiation()
      throws Exception {
    assertThat(this.reader.isNotNull()).isFalse();
    assertThat(this.factory.getBean(beanFactory)).isSameAs(dataSource);
  }
}
