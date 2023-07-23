package com.inhouse.mock.modules.pattern.normalizer;

import ch.qos.logback.core.util.DirectJson;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.EventData;
import lombok.Builder;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

@Builder
public class DataNormalizer {

  final String body;
  final String header;

  // @Value(fromConfig)
  String type;


  EventData dataNormalizerToCloudEventModel() {
    var data = body.formatted(DirectJson.class); // bodyAsJson
    var source = "theSourceInfo";
    return new EventData(UUID.randomUUID(), data, "type", source, "subject",
            "specVersion", "application/json",
            ZonedDateTime.now(ZoneId.of("UTC")));
  }

}
