package org.simulation.energyPlants;

import org.simulation.resources.ResourceStorage;
import org.simulation.resources.ResourceType;

public class NuclearPlant extends EnergyPlant {
  public NuclearPlant() {
    this.dailyEnergyProduction = 10000;
    this.usingResourceQuantity = 1;
    this.usingResourceType = ResourceType.URANIUM;
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
