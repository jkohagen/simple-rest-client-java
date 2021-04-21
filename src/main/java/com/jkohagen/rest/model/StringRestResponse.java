package com.jkohagen.rest.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class StringRestResponse extends AbstractRestResponse<String> {

  @Builder
  public StringRestResponse(int statusCode, String content) {
    this.statusCode = statusCode;
    this.content = content;
  }

}
