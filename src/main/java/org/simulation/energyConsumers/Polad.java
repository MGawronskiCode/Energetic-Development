package org.simulation.energyConsumers;

public class Polad extends EnergyConsumer {
  public Polad(int energyConsumption) {
    super(energyConsumption);
    this.energyConsumptionPerDay = 40000;
  }
}
