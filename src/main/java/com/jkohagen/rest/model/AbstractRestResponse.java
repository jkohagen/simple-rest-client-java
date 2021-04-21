package com.jkohagen.rest.model;

import lombok.Data;

@Data
public abstract class AbstractRestResponse<C> {

  protected int statusCode;
  protected C content;

  public boolean statusCodeIs200() {
    return statusCode == 200;
  }

}
