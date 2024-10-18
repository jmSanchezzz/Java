package hashMapList;

import java.util.*;

public class StorageFacility {
	HashMap<String, ArrayList<String>> storage;

	public StorageFacility() {
		storage = new HashMap<>();
	}
	public void add(String unit, String item) {
		storage.putIfAbsent(unit, new ArrayList<String>());
		storage.get(unit).add(item);
	}
	public ArrayList<String> contents(String storageUnit){
		ArrayList<String> emptyList = new ArrayList<>();
		return storage.getOrDefault(storageUnit, emptyList);
	}
	public void remove(String storageUnit, String item) {
		storage.get(storageUnit).remove(item);
		if(storage.get(storageUnit).isEmpty()) {
			storage.remove(storageUnit);
		}
	}
	public ArrayList<String> storageUnits(){
	    ArrayList<String> collection = new ArrayList<>();
		for(String units : storage.keySet()) {
			if(!(storage.get(units).isEmpty())) {
				collection.add(units);
			}
			
		}
		return collection;
	}
}
