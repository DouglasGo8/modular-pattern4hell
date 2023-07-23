package com.inhouse.mock.modules.pattern.shared.domain.valueobject;


import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@Builder
public class CloudEvent {
  String id;
  String data;
  String type;
  String source;
  String subject;
  String specVersion;
  String dataContentType;
  //
  ZonedDateTime time;


}
