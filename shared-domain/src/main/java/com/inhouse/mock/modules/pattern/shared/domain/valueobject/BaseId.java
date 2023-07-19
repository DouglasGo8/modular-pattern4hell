package com.inhouse.mock.modules.pattern.shared.domain.valueobject;

import lombok.Getter;

@Getter
public abstract class BaseId<ID> {
  final ID value;

  public BaseId(ID value) {
    this.value = value;
  }
}
