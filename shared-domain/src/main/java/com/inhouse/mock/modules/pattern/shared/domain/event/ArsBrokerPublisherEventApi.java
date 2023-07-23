package com.inhouse.mock.modules.pattern.shared.domain.event;

@FunctionalInterface
public interface ArsBrokerPublisherEventApi<T extends DomainEvent<?>> {
  void publish(T event);
}
