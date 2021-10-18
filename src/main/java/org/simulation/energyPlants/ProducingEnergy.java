package org.simulation.energyPlants;

import org.simulation.resources.ResourceStorage;

public interface ProducingEnergy {
  public int produceEnergy(ResourceStorage resourceStorage);
}
