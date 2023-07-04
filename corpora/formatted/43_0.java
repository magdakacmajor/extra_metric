class HibernateEntityManagerFactoryIntegrationTests {
  @Test
  public void testCanCastNativeEntityManagerFactoryToHibernateEntityManagerFactoryImpl() {
    EntityManagerFactoryInfo emfi = (EntityManagerFactoryInfo) entityManagerFactory;
    assertThat(
            emfi.getNativeEntityManagerFactory()
                .getClass()
                .getName()
                .endsWith("EntityManagerFactoryImpl"))
        .isTrue();
  }
}
