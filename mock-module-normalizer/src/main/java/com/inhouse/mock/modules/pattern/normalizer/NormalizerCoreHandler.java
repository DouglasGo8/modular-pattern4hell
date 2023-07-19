package com.inhouse.mock.modules.pattern.normalizer;

import com.inhouse.mock.modules.pattern.eventhub.broker.AzureEventHubPublisher;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.EventData;

import java.time.ZoneId;
import java.time.ZonedDateTime;


public class NormalizerCoreHandler {

  // Must be used with IoC/CDI concepts
  //DomainEventPublisher<CloudEvent<EventData>> publisher;


  /*
    EventData Or InterceptorData???
   */
  public void execute(EventData interceptorData) {
    var event = this.applyMapStructOverEventData(interceptorData);
    // Never used new to create an Object;
    var azureEventHubBroker = new AzureEventHubPublisher();
    azureEventHubBroker.publish(event);
  }


  CloudEvent<EventData> applyMapStructOverEventData(EventData interceptorData) {
    var type = "CloudEventType";
    var time = ZonedDateTime.now(ZoneId.of("UTC"));
    var subject = "CloudEventSubject";
    var specVersion = "CloudEventSpecVersion";
    var uriReference = "CloudEventUriReference";
    var dataContentType = "CloudEventDataContentType";
    //
    return CloudEvent.builder()
            .time(time)
            .type(type)
            .subject(subject)
            .specVersion(specVersion)
            .uriReference(uriReference)
            .dataContentType(dataContentType)
            .specializedEvent(interceptorData)
            .build();

  }


}
