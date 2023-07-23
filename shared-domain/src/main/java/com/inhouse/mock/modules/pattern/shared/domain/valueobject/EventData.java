package com.inhouse.mock.modules.pattern.shared.domain.valueobject;

import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
public class EventData extends CloudEvent {
  public EventData(UUID value, String data, String type,
                   String source, String subject, String specVersion,
                   String dataContentType, ZonedDateTime time) {
    //
    super(value, data, type, source, subject, specVersion, dataContentType, time);
  }
}
