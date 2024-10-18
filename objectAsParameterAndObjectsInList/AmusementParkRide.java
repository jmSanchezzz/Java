package objectAsParameterAndObjectsInList;
import java.util.*;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight; // Corrected spelling here
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }


    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < minimumHeight) {
            return false;
        }

        this.visitors++;
        this.riding.add(person);
        return true;
    }
    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person per: riding) {
            sumOfHeights += per.getHeight();
        }

        return  sumOfHeights / riding.size();
    }
    public Person getTallest() {
    	if(riding.isEmpty()) {
    		return null;
    	}
    	Person tallest = riding.get(0);
    	for(Person person:riding) {
    		if(tallest.getHeight()<person.getHeight()) {
    			tallest = person;
    		}
    	}
    	return tallest;
    }

    public String toString() {
        // let's form a string from all the people on the list
        String onTheRide = "";
        for (Person person: riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        // we return a string describing the object
        // including the names of those on the ride
        return this.name + ", minimum height requirement: " + this.minimumHeight +
            ", visitors: " + this.visitors + "\n" +
            "riding:\n" + onTheRide;
    }
}