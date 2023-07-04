class MarshallingMessageConverterTests {
  @Test
  public void toTextMessage() throws Exception {
    TextMessage textMessageMock = mock(TextMessage.class);
    Object unmarshalled = new Object();
    String text = "foo";
    given(sessionMock.createTextMessage(isA(String.class))).willReturn(textMessageMock);
    converter.toMessage(toBeMarshalled, sessionMock);
    verify(textMessageMock).marshal(eq(toBeMarshalled), isA(Result.class));
    verify(textMessageMock).writeObject(isA(byte[].class));
  }
}
