package com.jkohagen.rest.model;

import lombok.ToString;

@ToString
public class RestClientException extends Exception {

  private static final long serialVersionUID = -8592022803336262379L;
  
  public RestClientException() {
    super();
  }

  public RestClientException(String message) {
    super(message);
  }

  public RestClientException(Throwable cause) {
    super(cause);
  }

  public RestClientException(String message, Throwable cause) {
    super(message, cause);
  }

}
