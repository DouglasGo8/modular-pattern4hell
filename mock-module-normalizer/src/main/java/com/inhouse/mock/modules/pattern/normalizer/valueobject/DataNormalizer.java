package com.inhouse.mock.modules.pattern.normalizer.valueobject;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class DataNormalizer {
  String fields;
  String payload;
  String header;
  String data; // ToString == json


  public String getPayloadAsJson() {
    return """
            {
              "json": "fields"
            }
            """;
  }
}
