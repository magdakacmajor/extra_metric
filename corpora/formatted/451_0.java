class HibernateNativeEntityManagerFactoryIntegrationTests {
  @Test
  public void testEntityListener() {
    EntityManager<StompEntityManager> entityManagerFactory = mock(EntityManagerFactory.class);
    assertThat(entity.getEntityManager().getBean("foo")).isNull();
  }
}
