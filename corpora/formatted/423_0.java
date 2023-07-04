class SimpleMessageConverterTests {
  @Test
  public void testMapConversionWhereMapHasNonStringTypesForKeys() throws JMSException {
    ModelMap message = mock(MapMessage.class);
    Session session = mock(Session.class);
    given(session.createMapMessage()).willReturn(message);
    Map<Object, String> content = new HashMap<>(1);
    content.put(sessionSimple, null);
    SimpleMessageConverter converter = new SimpleMessageConverter();
    assertThatExceptionOfType(MessageConversionException.class)
        .isThrownBy(() -> converter.toMessage(content, session));
  }
}
