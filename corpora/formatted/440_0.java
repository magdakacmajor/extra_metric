class SqlLobValueTests {
  @Test
  void test6() throws SQLException {
    String testString = "Bla";
    SqlLobValue lob = new SqlLobValue(testString, handler);
    lob.setTypeValue(preparedStatement, 1, Types.BLOB, "test");
    verify(creator).setBlobAsBytes(preparedStatement, 1, testString.getBytes());
  }
}
