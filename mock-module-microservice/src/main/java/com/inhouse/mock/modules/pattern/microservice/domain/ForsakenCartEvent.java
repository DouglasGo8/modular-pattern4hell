package com.inhouse.mock.modules.pattern.microservice.domain;

import com.inhouse.mock.modules.pattern.shared.domain.valueobject.EventData;
import lombok.Getter;


@Getter
public class ForsakenCartEvent extends EventData {

  final String whyForsakenMethod;



  // GetMapping
  // Inner Builder can be used also
  public ForsakenCartEvent(String whyForsakenMethod) {

    this.whyForsakenMethod = whyForsakenMethod;
  }
}
