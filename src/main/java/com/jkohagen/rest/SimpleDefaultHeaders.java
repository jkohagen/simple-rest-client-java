package com.jkohagen.rest;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.message.BasicHeader;

public class SimpleDefaultHeaders implements IDefaultHeaders {

  @Override
  public List<Header> create() {
    List<Header> headers = new ArrayList<>();
    headers.add(new BasicHeader(HttpHeaders.ACCEPT, "application/json"));
    headers.add(new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"));
    return headers;
  }

}
