package com.jkohagen.rest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import com.jkohagen.rest.model.RestClientException;
import com.jkohagen.rest.model.StringRestResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class SimpleStringRestClient implements IRestClient<StringRestResponse> {

  private final IHttpClient httpClientBehavior;
  private final IDefaultHeaders headerBehavior;
  private final IBodyDecodingBehavior bodyDecodingBehavior;

  @Override
  public StringRestResponse get(String url) throws RestClientException {
    return get(url, new ArrayList<>());
  }
  
  @Override
  public StringRestResponse get(String url, List<Header> headers) throws RestClientException {
    try (CloseableHttpClient httpclient = httpClientBehavior.create()) {
      HttpGet httpGet = new HttpGet(URI.create(url));

      headerBehavior.create().stream().forEach(httpGet::addHeader);
      headers.stream().forEach(httpGet::addHeader);

      CloseableHttpResponse httpResponse = httpclient.execute(httpGet);

      return StringRestResponse.builder()
          .statusCode(httpResponse.getStatusLine().getStatusCode())
          .content((String) bodyDecodingBehavior.decode(httpResponse.getEntity().getContent()))
          .build();
    } catch (Exception e) {
      throw new RestClientException(e);
    }
  }


}
