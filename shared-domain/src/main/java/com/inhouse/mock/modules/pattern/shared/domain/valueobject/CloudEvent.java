package com.inhouse.mock.modules.pattern.shared.domain.valueobject;


import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

import java.util.UUID;

@Getter
@Builder // Fix with inner builder
public class CloudEvent<E extends EventData> extends BaseId<UUID> {

  final String type;
  final String subject;
  final String specVersion;
  final String uriReference;
  final String dataContentType;
  //
  final ZonedDateTime time;
  //
  final E specializedEvent;

  // Inner Builder can be used also
  public CloudEvent(String type, String subject,
                    String specVersion, String uriReference,
                    String dataContentType, ZonedDateTime time,
                    E specializedEvent) {

    // Only test purpose
    // ** CANNOT BE HARD-CODED ** Must be generated by an inner builder
    super(UUID.randomUUID());
    //
    this.time = time;
    this.type = type;
    this.subject = subject;
    this.specVersion = specVersion;
    this.uriReference = uriReference;
    this.dataContentType = dataContentType;
    //
    this.specializedEvent = specializedEvent;
  }

}
