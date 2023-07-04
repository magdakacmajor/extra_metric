class BeanWiringInfoTests {
  @Test
  public void ctorWithEmptyBeanName() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> new BeanWiringInfo(""));
  }
}
