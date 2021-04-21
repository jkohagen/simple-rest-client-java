package com.jkohagen.rest;

import org.apache.http.impl.client.CloseableHttpClient;

public interface IHttpClient {

  CloseableHttpClient create();

}
