class ViewResolutionIntegrationTests {
  @Test
  public void tiles() throws Exception {
    MockHttpServletResponse response = runTest(FreeMarkerWebConfig.class);
    assertThat(response.getContentAsString()).isEqualTo("<html><body>Hello World!</body></html>");
  }
}
