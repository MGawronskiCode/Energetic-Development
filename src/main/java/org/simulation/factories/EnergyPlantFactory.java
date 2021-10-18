package org.simulation.factories;

import org.simulation.energyPlants.*;

public class EnergyPlantFactory {
  public static EnergyPlant createAnnihilationPlant(){
    return new AnnihilationPlant();
  }

  public static EnergyPlant createCoalPlant(){
    return new CoalPlant();
  }

  public static EnergyPlant createFusionPlant(){
    return new FusionPlant();
  }

  public static EnergyPlant createNuclearPlant(){
    return new NuclearPlant();
  }

  public static SolarPlant createSolarPlant(){
    return new SolarPlant();
  }

}
