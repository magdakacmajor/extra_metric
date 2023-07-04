class GsonFactoryBeanTests {
  @Test
  public void disableHtmlEscaping() throws Exception {
    this.factory.setDisableHtmlEscaping(true);
    this.factory.afterPropertiesSet();
    Gson gson = this.factory.getObject();
    StringBean bean = new StringBean();
    bean.setName("Bob=Bob");
    String result = gson.toJson(bean);
    assertThat(result).isEqualTo("{\"name\":\"Bob\\u003d Bob\"}");
  }
}
