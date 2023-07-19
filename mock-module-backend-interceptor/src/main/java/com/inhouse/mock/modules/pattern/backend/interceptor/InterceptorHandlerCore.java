package com.inhouse.mock.modules.pattern.backend.interceptor;

import com.inhouse.mock.modules.pattern.normalizer.NormalizerCoreHandler;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.EventData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorHandlerCore {

  // Inject a ConfigurationClassYaml to handle over mYInterceptorByReflection method

  public void mYInterceptor(EventData interceptorData) {
    // handle Yaml Configuration
    // based-on on decision table concept
    var normalizer = new NormalizerCoreHandler(); // must be an interface, never create an object using new
    //if (interceptorData.getFields())
    //if (interceptorData.getHeader())
    //if (interceptorData.getPayload())
    normalizer.execute(interceptorData);
  }


  public void mYInterceptorByReflection(String yamlConfig) {
    //if (yamlConfig... )
    final EventData eventData = null; // who's EventData Implementation
  }


}
