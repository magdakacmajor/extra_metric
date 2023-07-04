class JdbcTemplateQueryTests {
  @Test
  public void testQueryForListWithArgsAndEmptyResult() throws Exception {
    String sql = "SELECT AGE FROM CUSTMR WHERE ID<3";
    given(this.resultSet.next()).willReturn(true, false);
    List<Map<String, Object>> li = this.template.queryForList(sql);
    assertThat(li.size()).as("All rows:-WHERE ID failed").isEqualTo(1);
    verifyAndMoreInteractions(this.resultSet);
  }
}
