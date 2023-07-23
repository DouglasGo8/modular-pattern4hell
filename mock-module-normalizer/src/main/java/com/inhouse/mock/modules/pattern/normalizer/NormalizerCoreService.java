package com.inhouse.mock.modules.pattern.normalizer;

import com.inhouse.mock.modules.pattern.eventhub.broker.AzureEventHubPublisher;


public class NormalizerCoreService {


  /*
    EventData Or InterceptorData???
   */
  public void execute(DataNormalizer dataNormalizer) {
    //var event = this.applyMapStructOverEventData(dataNormalizer);
    // Never used new to create an Object;
    //
    var azureEventHubBroker = new AzureEventHubPublisher();
    var domainEventImpl = new DataNormalizerMessageMapper(dataNormalizer);
    //
    azureEventHubBroker.publish(domainEventImpl); //
  }


}
