package com.inhouse.mock.modules.pattern.normalizer;

import com.inhouse.mock.modules.pattern.shared.domain.event.DomainEvent;
import com.inhouse.mock.modules.pattern.shared.domain.valueobject.CloudEvent;

public record DataNormalizerMessageMapper(DataNormalizer dataNormalizer) implements DomainEvent<CloudEvent> {
  @Override
  public CloudEvent getCloudEventModel() {
    return dataNormalizer.dataNormalizerToCloudEventModel();
  }
}
