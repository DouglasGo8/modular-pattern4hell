package com.inhouse.mock.modules.pattern.shared.domain.event;

import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;

@FunctionalInterface
public interface DomainEventPublisher<T extends CloudEvent> {
  void publish(T event);
}
