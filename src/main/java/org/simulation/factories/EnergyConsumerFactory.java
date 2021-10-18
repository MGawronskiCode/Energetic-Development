package org.simulation.factories;

import org.simulation.energyConsumers.EnergyConsumer;
import org.simulation.energyConsumers.NewYork;
import org.simulation.energyConsumers.Poland;
import org.simulation.energyConsumers.World;

public class EnergyConsumerFactory {

  public static EnergyConsumer createNewYork() {
    return new NewYork();
  }

  public static EnergyConsumer createPoland() {
    return new Poland();
  }

  public static EnergyConsumer createWorld() {
    return new World();
  }

}
