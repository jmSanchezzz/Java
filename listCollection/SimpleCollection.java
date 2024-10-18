package listCollection;
import java.util.*;
public class SimpleCollection {
	String name;
	ArrayList<String> collection;

	public SimpleCollection(String name) {
		this.collection = new ArrayList<>();
		this.name = name;
		
	}
	void add(String element) {
		collection.add(element);
	}
	
	public String toString() {
		if(collection.isEmpty()) {
			return "The collection characters is empty.";
		}
		String elements = "";
		for(String collection : collection) {
			elements = elements+collection+"\n";
		}
		if(collection.size()==1) {
			return "The collection " + name +" has "+ collection.size() +" element:\n" +elements;
		}
		return "The collection " + name +" has "+ collection.size() +" elements:\n" +elements;
	}
	
}
