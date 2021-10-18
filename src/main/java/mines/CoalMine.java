package mines;

import resources.ResourceType;

public class CoalMine extends Mine {
  public CoalMine() {
    this.resourceType = ResourceType.COAL;
    this.dailyProductionVolume = 40;
  }
}
