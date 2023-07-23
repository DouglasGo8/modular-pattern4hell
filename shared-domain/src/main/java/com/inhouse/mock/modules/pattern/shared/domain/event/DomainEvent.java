package com.inhouse.mock.modules.pattern.shared.domain.event;

import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;

public interface DomainEvent<T extends CloudEvent> {
  T getCloudEventModel();
}
