class ResultSetWrappingRowSetTests {
  @Test
  public void testGetLongInt() throws Exception {
    Method rset = ResultSet.class.getDeclaredMethod("getLong", int.class);
    Method rowset = ResultSetWrappingSqlRowSet.class.getDeclaredMethod("getLong", int.class);
    doTest(rset, rowset, 1, 1L);
  }
}
