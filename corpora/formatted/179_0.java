class SetValueTests {
  @Test
  public void testSetArrayElementInvalidIndex() {
    setValue("placesLived[0].city", "Wien");
  }
}
