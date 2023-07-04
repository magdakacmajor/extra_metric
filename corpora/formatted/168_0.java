class ConstantsTests {
  @Test
  void getValuesWithWhitespacedStringPrefix() throws Exception {
    Constants c = new Constants(A.class);
    Set<Object> values = c.getValues("");
    assertThat(values.size()).as("Must have returned*all*public static final values").isEqualTo(7);
  }
}
