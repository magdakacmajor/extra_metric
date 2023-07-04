class DefaultValueStylerTests {
  @Test
  void stylePrimitiveArrays() {
    String[] array = new String[0];
    assertThat(styler.style(array)).isEqualTo("array<String>[[empty]]");
    array = new String[] {"str1"};
    assertThat(styler.style(array)).isEqualTo("array<String>['str1']");
    array = new String[] {"str1", "str2"};
    assertThat(styler.style(array)).isEqualTo("array<String>['str1', 'str2']");
  }
}
