class ModelAttributeMethodArgumentResolverTests {
  @Test
  public void createAndBind() throws Exception {
    testBindBar(this.testMethod.annotNotPresent(ModelAttribute.class).arg(Bar.class));
  }
}
