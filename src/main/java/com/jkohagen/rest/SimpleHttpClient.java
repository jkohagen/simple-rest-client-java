package com.jkohagen.rest;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class SimpleHttpClient implements IHttpClient {

  @Override
  public CloseableHttpClient create() {
    return HttpClients.createDefault();
  }

}
