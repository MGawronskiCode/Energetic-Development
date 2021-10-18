package resources;

import java.util.Map;

public class ResourceStorage {
  private ResourceStorage instance;
  private Map<ResourceType, Integer> storage;

  public ResourceStorage getInstance() {
    if (instance == null)
      instance = new ResourceStorage();
    return instance;
  }

  public void addResource(ResourceType resourceType, int quantity){
    if (storage.containsKey(resourceType)){
      increaseResourceByValue(resourceType, quantity);
    } else
      storage.put(resourceType, quantity);
  }

  private void increaseResourceByValue(ResourceType resourceType, int quantity) {
    int actualVal = storage.get(resourceType);
    storage.remove(resourceType);
    storage.put(resourceType, actualVal+ quantity);
  }

}
