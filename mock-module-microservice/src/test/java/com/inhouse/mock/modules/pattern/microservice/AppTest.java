package com.inhouse.mock.modules.pattern.microservice;

import com.inhouse.mock.modules.pattern.backend.interceptor.InterceptorHandlerCore;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class AppTest {

  @Test
  public void testInterceptorMockSimulation() {
    //
    var interceptor = new InterceptorHandlerCore();
    // Will be invoked automatically
    interceptor.mYInterceptor();
  }


}
