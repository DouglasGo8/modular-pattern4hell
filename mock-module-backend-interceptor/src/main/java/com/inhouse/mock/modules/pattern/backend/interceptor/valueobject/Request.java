package com.inhouse.mock.modules.pattern.backend.interceptor.valueobject;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Request {
  String header;
  String payload;
}
