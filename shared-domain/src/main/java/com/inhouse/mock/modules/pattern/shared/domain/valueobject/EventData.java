package com.inhouse.mock.modules.pattern.shared.domain.valueobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@ToString
public class EventData implements Serializable {
  String header;
  String payload; // only json format
}
