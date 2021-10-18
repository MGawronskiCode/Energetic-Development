package mines;

import resources.ResourceType;

public class HadronCollider {
  private static int dayPassedCounter = 0;
  private final ResourceType resourceType;
  private final int weeklyProductionVolume;

  public HadronCollider() {
    resourceType = ResourceType.ANTIMATTER;
    weeklyProductionVolume = 1;
  }

  public static void increaseDayPassedCounter() {
    dayPassedCounter++;
  }
}
