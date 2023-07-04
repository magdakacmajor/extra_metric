class AutoPopulatingListTests {
  @Test
  void withElementFactoryAndUserSuppliedBackingList() throws Exception {
    doTestWithElementFactory(new AutoPopulatingList<Object>(new ArrayList<>(), TestObject.class));
  }
}
