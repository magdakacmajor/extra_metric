class ResultSetWrappingRowSetTests {
  @Test
  public void testGetBooleanString() throws Exception {
    Method rset = ResultSet.class.getDeclaredMethod("getBoolean", int.class);
    Method rowset = ResultSetWrappingSqlRowSet.class.getDeclaredMethod("getBoolean", String.class);
    doTest(rset, rowset, "test", true);
  }
}
