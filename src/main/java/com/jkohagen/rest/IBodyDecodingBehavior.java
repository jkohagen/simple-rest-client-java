package com.jkohagen.rest;

import java.io.IOException;
import java.io.InputStream;

public interface IBodyDecodingBehavior {

  Object decode(InputStream is) throws IOException;

}
