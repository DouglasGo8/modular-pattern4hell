package com.inhouse.mock.modules.pattern.backend.interceptor;

import com.inhouse.mock.modules.pattern.normalizer.NormalizerCoreHandler;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.EventData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class InterceptorHandlerCore {

  public void mYInterceptor(EventData interceptorData) {
    // handle Yaml Configuration
    // based-on on decision table concept
    var normalizer = new NormalizerCoreHandler(); // must be an interface, never create object using new
    log.info("Details of Interceptor {}", interceptorData);
    //if (interceptorData.getFields())
    //if (interceptorData.getHeader())
    //if (interceptorData.getPayload())
    normalizer.execute(interceptorData);
  }


}
