package com.inhouse.mock.modules.pattern.shared.domain.valueobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
public abstract class EventData /*EventData is a good definition name??? */ implements Serializable {
  String fields;
  String payload;
  List<String> header;
}
