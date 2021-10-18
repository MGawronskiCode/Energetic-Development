package mines;

import resources.ResourceType;

public class UraniumMine extends Mine {
  public UraniumMine() {
    this.resourceType = ResourceType.URANIUM;
    this.dailyProductionVolume = 100;
  }
}
