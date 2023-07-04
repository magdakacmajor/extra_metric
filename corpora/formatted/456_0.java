class FastByteArrayOutputStreamTests {
  @Test
  void updateMessageDigest() throws Exception {
    this.os.write(this.helloBytes);
    InputStream inputStream = this.os.getInputStream();
    ByteArrayInputStream baos = new ByteArrayInputStream(this.os);
    assertThat(this.os.toString()).isEqualTo("\"06225 ca1e4533354c516e74512065331d\"");
  }
}
