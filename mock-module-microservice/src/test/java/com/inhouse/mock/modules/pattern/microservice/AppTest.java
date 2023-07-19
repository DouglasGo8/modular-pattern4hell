package com.inhouse.mock.modules.pattern.microservice;

import com.inhouse.mock.modules.pattern.backend.interceptor.InterceptorHandlerCore;
import com.inhouse.mock.modules.pattern.microservice.domain.ForsakenCartEvent;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class AppTest {

  @Test
  public void testPublishForsakenCartEventDetails() {

    var method = "ForsakenCartDetails";

    // Mocks Interceptor automatized action(S)
    var forsakenCart = new ForsakenCartEvent(method);
    //
    forsakenCart.setFields("fields");
    forsakenCart.setHeader(List.of("header1", "header2"));
    forsakenCart.setPayload("Payload");
    var interceptor = new InterceptorHandlerCore();
    //
    interceptor.mYInterceptor(forsakenCart);
  }


  @Test
  public void testPublishForsakenCartEventByConfigAndReflection() {
    var interceptor = new InterceptorHandlerCore();
    var yamlConfig = """
              interceptor-rules: event: ForsakenCart.class
            """;
    interceptor.mYInterceptorByReflection(yamlConfig);
  }

}
