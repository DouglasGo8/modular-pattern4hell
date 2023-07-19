package com.inhouse.mock.modules.pattern.microservice;

import com.inhouse.mock.modules.pattern.backend.interceptor.InterceptorHandlerCore;
import com.inhouse.mock.modules.pattern.backend.interceptor.valueobject.Request;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class AppTest {

  @Test
  public void testInterceptorMockSimulation() {

    //var method = "ForsakenCartDetails";

    // Mocks Interceptor automatized action(S)
    //var forsakenCart = new ForsakenCartEvent(method);
    //
    //forsakenCart.setFields("fields");
    ///forsakenCart.setHeader(List.of("header1", "header2"));
    //forsakenCart.setPayload("Payload");

    var request = Request.builder()
            .header("MyHeader")
            .payload("MyPayload")
            .build();
    //
    var interceptor = new InterceptorHandlerCore();
    //
    interceptor.mYInterceptor(request);
    //interceptor.mYInterceptor(forsakenCart);
  }


}
