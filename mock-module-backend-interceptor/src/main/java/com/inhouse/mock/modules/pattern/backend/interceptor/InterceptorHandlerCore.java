package com.inhouse.mock.modules.pattern.backend.interceptor;

import com.inhouse.mock.modules.pattern.backend.interceptor.valueobject.Request;
import com.inhouse.mock.modules.pattern.normalizer.NormalizerCoreHandler;
import com.inhouse.mock.modules.pattern.normalizer.valueobject.DataNormalizer;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;

@Slf4j
public class InterceptorHandlerCore {


  // Inject a ConfigurationClassYaml to handle over mYInterceptorByReflection method

  public void mYInterceptor(Request request /* Framework Request/Response */) {
    // handle Yaml Configuration
    // based-on on decision table concept
    var normalizer = new NormalizerCoreHandler(); // must be an interface, never create an object using new
    //if (interceptorData.getFields())
    //if (interceptorData.getHeader())
    //if (interceptorData.getPayload())

    var dataNormalizer = DataNormalizer
            .builder()
            .header(request.getHeader())
            .payload(request.getPayload())
            .build();

    // PoolThread Async
    Executors.newFixedThreadPool(5).execute(() -> normalizer.execute(dataNormalizer));

  }


}
