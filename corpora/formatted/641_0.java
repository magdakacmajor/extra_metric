class DataBinderFieldAccessTests {
  @Test
  public void nestedBindingWithDisabledAutoGrow() throws Exception {
    TestBean rod = new TestBean();
    DataBinder binder = new DataBinder(rod, "person");
    MutablePropertyValues pvs = new MutablePropertyValues();
    pvs.add("name", "Rod");
    pvs.add("spouse.age", 32);
    assertThat(target.getName()).isEqualTo("Rod");
  }
}
