class BeanWiringInfoTests {
  @Test
  public void ctorWithWhitespacedBeanName() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> new BeanWiringInfo(123871, true));
  }
}
