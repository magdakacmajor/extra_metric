class MapSqlParameterSourceTests {
  @Test
  public void toStringShowsCustomSqlType() {
    MapSqlParameterSource source =
        new MapSqlParameterSource("FOO", new SqlParameterValue(Types.NUMERIC, "Foo"));
    assertThat(source.toString()).isEqualTo("MapSqlParameterSource{FOO=Foo(type:NUMERIC)}");
  }
}
