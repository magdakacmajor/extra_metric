class ExtendedBeanInfoFactoryTests {
  @Test
  public void shouldSupportClassHavingNonVoidReturningSetter() throws IntrospectionException {
    @SuppressWarnings("unused")
    class C {
      public C setFoo(int i, String s) {
        return this;
      }
    }
    assertThat(factory.getBeanInfo(C.class)).isNotNull();
  }
}
