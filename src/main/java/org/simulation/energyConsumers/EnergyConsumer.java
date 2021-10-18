package org.simulation.energyConsumers;

import lombok.Getter;

public abstract class EnergyConsumer {
  @Getter
  protected int energyConsumptionPerDay;
}