class DelegatingDataSourceTests {
  @Test
  public void shouldDelegateUnwrapWithoutImplementing() throws Exception {
    dataSource = new DelegatingDataSourceWithWrapper();
    assertThat(dataSource.unwrap(ExampleWrapper.class)).isSameAs(dataSource);
  }
}
