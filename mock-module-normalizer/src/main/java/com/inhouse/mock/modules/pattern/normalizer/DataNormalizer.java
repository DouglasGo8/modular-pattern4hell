package com.inhouse.mock.modules.pattern.normalizer;

import ch.qos.logback.core.util.DirectJson;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;
import lombok.Builder;

import java.util.UUID;

@Builder
public class DataNormalizer {

  final String body;
  final String header;

  // @Value(fromConfig)
  String type;


  CloudEvent dataNormalizerToCloudEventModel() {
    var data = body.formatted(DirectJson.class); // bodyAsJson


    return CloudEvent.builder()
            .id(UUID.randomUUID().toString())
            .type("type")
            .data(data)
            .dataContentType("application/json")
            .build();

    //return new EventData(UUID.randomUUID(), data, "type", source, "subject",
    //        "specVersion", "application/json",
    //        ZonedDateTime.now(ZoneId.of("UTC")));
  }

}
