package org.simulation.factories;

import org.simulation.mines.*;

public class MineFactory {

  public static Mine createCoalMine() {
    return new CoalMine();
  }

  public static HadronCollider createHadronCollider() {
    return new HadronCollider();
  }

  public static Mine createMoonMine() {
    return new MoonMine();
  }

  public static Mine createUraniumMine() {
    return new UraniumMine();
  }

}
