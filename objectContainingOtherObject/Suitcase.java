package objectContainingOtherObject;
import java.util.*;
public class Suitcase {
	ArrayList<Item> container;
	private int maximumWeight;
	private int totalWeight;
public Suitcase(int maximumWeight) {
	this.maximumWeight= maximumWeight;
	container = new ArrayList<>();
	
}
public void addItem(Item item) {
	if(totalWeight+item.getWeight()<maximumWeight) {
		totalWeight+=item.getWeight();
	    container.add(item);
	}
	
	
}
public void printItems() {
	for(Item items: container) {
		System.out.println(items);
	}
}
public int totalWeight() {
	return totalWeight;
}
public Item heaviestItem() {
	if(container.isEmpty()) {
		return null;
	}
	Item heaviest = container.get(0);
	for(Item item : container) {
		if(heaviest.getWeight()<item.getWeight()) {
			heaviest = item;
		}
	}
	return heaviest;
}

public String toString() {
	if(container.isEmpty()) {
		return "no items " +"("+totalWeight+" kg)";
	}
	if(container.size()==1) {
		return container.size()+" item "+"("+totalWeight+" kg)";
	}
	return container.size()+" items "+"("+totalWeight+" kg)";
}
}