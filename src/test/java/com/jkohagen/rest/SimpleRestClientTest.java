package com.jkohagen.rest;

import static org.junit.Assert.assertEquals;
import org.apache.http.HttpStatus;
import org.junit.Ignore;
import org.junit.Test;
import com.jkohagen.rest.model.StringRestResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleRestClientTest {

  @Test
  @Ignore("Live Test")
  public void liveGetTest() throws Exception {
    SimpleStringRestClient client = creatSimpleStringRestClient();
    
    StringRestResponse response = client.get("https://httpbin.org/get");
    log.info("response: '{}'", response);
    
    assertEquals(HttpStatus.SC_OK, response.getStatusCode());
  }
  
  private SimpleStringRestClient creatSimpleStringRestClient() {
    return SimpleStringRestClient.builder()
    .bodyDecodingBehavior(new StringBodyDecoding())
    .headerBehavior(new SimpleDefaultHeaders())
    .httpClientBehavior(new SimpleHttpClient())
    .build();
  }

}
