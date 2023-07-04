class PersistenceInjectionTests {
  @Test
  public void testSetterOfWrongTypeAnnotatedWithPersistenceUnit() {
    PersistenceAnnotationBeanPostProcessor pabpp = new PersistenceAnnotationBeanPostProcessor();
    assertThatIllegalStateException()
        .isThrownBy(() -> pabpp.postProcessProperties(null, new SetterWithNoArgs(), "bean"));
  }
}
