package com.inhouse.mock.modules.pattern.eventhub.broker;

import com.inhouse.mock.modules.pattern.shared.domain.event.ArsBrokerPublisherEventApi;
import com.inhouse.mock.modules.pattern.shared.domain.event.DomainEvent;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AzureEventHubPublisher implements ArsBrokerPublisherEventApi<DomainEvent<CloudEvent>> {

  @Override
  public void publish(DomainEvent<CloudEvent> domainEvent) {
    //
    var event = domainEvent.getCloudEventModel();
    //
    log.info("{}", event.getData());
    log.info("{}", event.getType());
    log.info("{}", event.getValue());
  }
}
