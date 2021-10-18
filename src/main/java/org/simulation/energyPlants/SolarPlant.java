package org.simulation.energyPlants;

import org.simulation.resources.ResourceStorage;

public class SolarPlant implements ProducingEnergy {
  private final int dailyEnergyProduction;

  public SolarPlant() {
    this.dailyEnergyProduction = 2;
  }

  @Override
  public int produceEnergy(ResourceStorage resourceStorage) {
    return dailyEnergyProduction;
  }
}
