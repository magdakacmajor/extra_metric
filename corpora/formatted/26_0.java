class JndiPropertySourceTests {
  @Test
  public void propertyWithDefaultClauseInResourceRefMode() {
    JndiLocatorDelegate jndiLocator =
        new JndiLocatorDelegate() {
          @Override
          public Object lookup(String jndiName) throws NamingException {
            assertThat(jndiName).isEqualTo("my:key");
            return "my:value";
          }
        };
    jndiLocator.setResourceRef(false);
    JndiPropertySource ps = new JndiPropertySource("jndiProperties", jndiLocator);
    assertThat(ps.getProperty("my:key")).isEqualTo("my:value");
  }
}
