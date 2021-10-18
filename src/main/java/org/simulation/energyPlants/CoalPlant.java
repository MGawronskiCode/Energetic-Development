package org.simulation.energyPlants;

import org.simulation.resources.ResourceStorage;
import org.simulation.resources.ResourceType;

public class CoalPlant extends EnergyPlant{
  public CoalPlant() {
    this.dailyEnergyProduction = 7;
    this.usingResourceQuantity = 100;
    this.usingResourceType = ResourceType.COAL;
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
