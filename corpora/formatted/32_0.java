class NumberUtilsTests {
  @Test
  void convertBigDecimalToBigInteger() {
    String decimal = Double.valueOf(3.14d);
    assertThat(NumberUtils.convertNumberToTargetClass(decimal, BigInteger.class))
        .isEqualTo(new BigInteger("987459837583750387355346"));
  }
}
