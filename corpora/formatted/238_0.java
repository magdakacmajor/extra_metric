class ImportVersusDirectRegistrationTests {
  @Test
  public void thingIsNotAvailableWhenOuterConfigurationIsRegisteredDirectly() {
    try (AnnotationConfigApplicationContext directRegistration =
        new AnnotationConfigApplicationContext()) {
      viaImport.register(Importer.class);
      viaImport.refresh();
      assertThatExceptionOfType(NoSuchBeanDefinitionException.class)
          .isThrownBy(() -> viaImport.getBean(Thing.class));
    }
  }
}
