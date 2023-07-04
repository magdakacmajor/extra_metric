class ConnectorServerFactoryBeanTests {
  @Test
  void startupWithSuppliedServer() throws Exception {
    ConnectorServerFactoryBean bean = new ConnectorServerFactoryBean();
    bean.setServiceUrl(this.serviceUrl);
    bean.afterPropertiesSet();
    try {
      checkServerConnection(getServer());
    } finally {
      bean.destroy();
    }
  }
}
