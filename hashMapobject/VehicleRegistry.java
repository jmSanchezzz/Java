package hashMapobject;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
	HashMap<LicensePlate, String> directory;

	public VehicleRegistry() {
		
		directory = new HashMap<>();
		
	}
	
	public boolean add(LicensePlate plate, String owner) {
		for(LicensePlate e : directory.keySet()) {
			if(e.equals(plate)) {
				return false;
			}
			
		}
		directory.put(plate, owner);
			return true;
	}
	public String get(LicensePlate plate) {
		return directory.getOrDefault(plate, null);
	}
	public boolean remove(LicensePlate plate) {
		if(!(directory.containsKey(plate))) {
			return false;
		}
		directory.remove(plate);
		return true;
	}
	public void printLicensePlates() {
		for(LicensePlate e: directory.keySet()) {
			System.out.println(e);
		}
	}
	public void printOwners() {
		ArrayList<String> owners = new ArrayList<>();
		for(String person : directory.values()) {
			if(!(owners.contains(person))) {
				owners.add(person);
			}
		}
		for(String owner : owners) {
			System.out.println(owner);
		}
	}
}
