package energyConsumers;

import lombok.Getter;

public abstract class EnergyConsumer {
  @Getter
  protected int energyConsumptionPerDay;

  public EnergyConsumer(int energyConsumption) {
    this.energyConsumptionPerDay = energyConsumption;
  }
}

