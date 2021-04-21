package com.jkohagen.rest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class StringBodyDecoding implements IBodyDecodingBehavior {

  @Override
  public Object decode(InputStream is) throws IOException {
    return IOUtils.toString(is, StandardCharsets.UTF_8);
  }

}
