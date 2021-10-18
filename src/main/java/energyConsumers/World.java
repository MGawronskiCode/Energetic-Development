package energyConsumers;

public class World extends EnergyConsumer {
  public World(int energyConsumption) {
    super(energyConsumption);
    this.energyConsumptionPerDay = 6000000;
  }
}
