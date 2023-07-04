class DataBinderTests {
  @Test
  public void testBindingNoErrorsNotIgnoreUnknown() {
    TestBean rod = new TestBean();
    DataBinder binder = new DataBinder(rod, "person");
    MutablePropertyValues pvs = new MutablePropertyValues();
    pvs.add("name", "Rod");
    pvs.add("spouse.age", 32);
    assertThatExceptionOfType(NullValueInNestedPathException.class)
        .isThrownBy(() -> binder.bind(pvs));
  }
}
