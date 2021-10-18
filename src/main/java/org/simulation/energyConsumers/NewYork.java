package org.simulation.energyConsumers;

public class NewYork extends EnergyConsumer {
  public NewYork(int energyConsumption) {
    super(energyConsumption);
    this.energyConsumptionPerDay = 10000;
  }
}
