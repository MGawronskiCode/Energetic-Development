package org.simulation.energyPlants;

import org.simulation.resources.ResourceStorage;
import org.simulation.resources.ResourceType;

public class AnnihilationPlant extends EnergyPlant {
  public AnnihilationPlant() {
    this.dailyEnergyProduction = 25000;
    this.usingResourceQuantity = 1;
    this.usingResourceType = ResourceType.ANTIMATTER;
  }

  @Override
  public int produceEnergy(ResourceStorage resourceStorage) {
    if (resourceStorage.getStorage().get(usingResourceType) >= usingResourceQuantity) {
      resourceStorage.subtractResource(usingResourceType, usingResourceQuantity);
      return dailyEnergyProduction;
    }
    return 0;
  }
}
