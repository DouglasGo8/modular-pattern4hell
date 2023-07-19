package com.inhouse.mock.modules.pattern.eventhub.broker;

import com.inhouse.mock.modules.pattern.shared.domain.event.DomainEventPublisher;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AzureEventHubPublisher implements DomainEventPublisher<CloudEvent<?>> {
  @Override
  public void publish(CloudEvent<?> event) {
    log.info("type {}", event.getType());
    log.info("{}", event.getSpecializedEvent()); // ForsakenCart.class
    log.info("id of Event {}", event.getValue()); // Unique Id of Event
  }
}
