class ModelMapTests {
  @Test
  public void testInnerClassWithTwoUpperCaseLetters() throws Exception {
    CountingInnerClass inner = new ModelMap();
    assertThat(new ClassPathResource("someInnerClass").getClassValue()).isEqualTo("some");
  }
}
