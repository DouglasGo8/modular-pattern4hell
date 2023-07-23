package com.inhouse.mock.modules.pattern.backend.interceptor;

import com.inhouse.mock.modules.pattern.normalizer.DataNormalizer;
import com.inhouse.mock.modules.pattern.normalizer.NormalizerCoreService;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;

@Slf4j
public class InterceptorHandlerCore {

  // Inject a ConfigurationClassYaml to handle over mYInterceptorByReflection method

  public void mYInterceptor() {
    // handle Yaml Configuration
    // based-on on decision table concept

    //if (interceptorData.getFields())
    //if (interceptorData.getHeader())
    //if (interceptorData.getPayload())
    var normalizer = new NormalizerCoreService(); // must be an interface, never create an object using new
    //
    String header = "MyHeader";
    String payload = "MyPayload";
    //
    var data = DataNormalizer.builder()
            .body(payload)
            .header(header)
            .build();

    // PoolThread Async
    Executors.newFixedThreadPool(5).execute(() -> normalizer.execute(data));

  }

}
