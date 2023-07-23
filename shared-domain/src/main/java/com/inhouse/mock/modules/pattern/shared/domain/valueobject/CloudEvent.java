package com.inhouse.mock.modules.pattern.shared.domain.valueobject;


import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
public abstract class CloudEvent extends BaseId<UUID> {
  final String data;
  final String type;
  final String source;
  final String subject;
  final String specVersion;
  final String dataContentType;
  //
  final ZonedDateTime time;

  public CloudEvent(UUID value, String data, String type, String source,
                    String subject, String specVersion,
                    String dataContentType,
                    ZonedDateTime time) {
    super(value);
    this.data = data;
    this.time = time;
    this.type = type;
    this.source = source;
    this.subject = subject;
    this.specVersion = specVersion;
    this.dataContentType = dataContentType;
  }
  //


}
