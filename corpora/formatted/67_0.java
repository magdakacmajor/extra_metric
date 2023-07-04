class JdbcTemplateTests {
  @Test
  public void testStringsWithStaticSql() throws Exception {
    final Integer argument = 99;
    doTestStrings(
        null,
        null,
        null,
        argument,
        (template, sql, rch) -> template.query(sql, ps -> ps.setObject(1, argument), rch));
  }
}
