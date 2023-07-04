class DefaultConversionServiceTests {
  @Test
  void stringToEnumEmptyString() {
    assertThat(
            conversionService.convert(
                "",
                TypeDescriptor.valueOf(String.class),
                new TypeDescriptor(getClass().getField("enumSet"))))
        .isEqualTo(EnumSet.of(Foo.BAR));
  }
}
