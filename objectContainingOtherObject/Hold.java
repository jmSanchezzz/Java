package objectContainingOtherObject;
import java.util.*;
public class Hold {
	private int maximumWeight;
	ArrayList<Suitcase> container;
	private int totalWeight = 0;
	public Hold(int maximumWeight) {
		this.maximumWeight = maximumWeight;
		container = new ArrayList<>();
		
	}
	public void addSuitcase(Suitcase suitcase) {
		if(totalWeight+suitcase.totalWeight()<maximumWeight) {
			totalWeight+=suitcase.totalWeight();
		    container.add(suitcase);
		}
	}
	public void printItems() {
		for(Suitcase items : container) {
			items.printItems();
		}
	}
	public String toString() {
		return container.size() +" suitcases" + " ("+ totalWeight+"kg)";
	}
	
	

}
