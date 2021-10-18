package org.simulation.energyConsumers;

import lombok.Getter;

public abstract class EnergyConsumer {
  @Getter
  protected int energyConsumptionPerDay;

  protected EnergyConsumer(int energyConsumption) {
    this.energyConsumptionPerDay = energyConsumption;
  }
}

