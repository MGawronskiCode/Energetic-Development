package org.simulation.mines;

import org.simulation.resources.ResourceType;

public class MoonMine extends Mine {
  public MoonMine() {
    this.resourceType = ResourceType.HELIUM;
    this.dailyProductionVolume = 10;
  }
}
