class Jaxb2XmlDecoderTests {
  @Test
  public void decodeSingleXmlTypeElement() throws Exception {
    Mono<DataBuffer> source = stringBuffer(POJO_ROOT);
    Mono<Object> output =
        this.decoder.decodeToMono(
            source, ResolvableType.forClass(Pojo.class), null, Collections.emptyMap());
    StepVerifier.create(output).expectNext(new Pojo("foofoo", "barbar")).expectComplete().verify();
  }
}
