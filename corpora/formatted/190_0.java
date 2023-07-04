class MatrixVariablesMethodArgumentResolverTests {
  @Test
  public void resolveArgumentDefaultValue() throws Exception {
    getVariablesFor("cars").add("year", "2006");
    getVariablesFor("bikes").add("year", "2005");
    MethodParameter param = this.testMethod.annot(matrixAttribute().name("year")).arg(int.class);
    Object actual =
        this.resolver
            .resolveArgument(param, new BindingContext(), this.exchange)
            .block(Duration.ZERO);
    assertThat(actual).isEqualTo(2006);
  }
}
