package com.jkohagen.rest;

import java.util.List;
import org.apache.http.Header;
import com.jkohagen.rest.model.AbstractRestResponse;
import com.jkohagen.rest.model.RestClientException;

public interface IRestClient<R extends AbstractRestResponse<?>> {

  R get(String url) throws RestClientException;
  
  R get(String url, List<Header> headers) throws RestClientException;

}
