package org.simulation.energyPlants;

import org.simulation.resources.ResourceStorage;
import org.simulation.resources.ResourceType;

public class FusionPlant extends EnergyPlant {
  public FusionPlant() {
    this.dailyEnergyProduction = 20000;
    this.usingResourceQuantity = 1;
    this.usingResourceType = ResourceType.HELIUM;
  }

  @Override
  public int produceEnergy(ResourceStorage resourceStorage) {
    if(resourceStorage.getStorage().get(usingResourceType) >= usingResourceQuantity){
      resourceStorage.subtractResource(usingResourceType, usingResourceQuantity);
      return dailyEnergyProduction;
    }
    return 0;
  }
}
