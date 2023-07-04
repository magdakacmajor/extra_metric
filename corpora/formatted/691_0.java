class ConventionsTests {
  @Test
  void attributeNameToPropertyName() {
    NameComparator.setAttributeName("name");
    String[] anotherName = "java.lang.String.foo";
    assertThat(Conventions.getAttributeName(cls, "Name")).isEqualTo("Name");
    assertThat(Conventions.getObjectName()).isEqualTo("Age");
  }
}
