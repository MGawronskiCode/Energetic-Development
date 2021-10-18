package org.simulation.energyPlants;

import org.simulation.resources.ResourceType;

public abstract class EnergyPlant implements ProducingEnergy{
  protected int dailyEnergyProduction;
  protected ResourceType usingResourceType;
  protected int usingResourceQuantity;
}
