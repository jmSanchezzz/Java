package javaMooc;

import java.util.*;

public class Person {
	Scanner scan = new Scanner(System.in);
	public static ArrayList<Person> persons = new ArrayList <>();
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    public static void personalDetails() {
    	Scanner scan = new Scanner(System.in);
    	String name1;
    	int age1;
    	while (true) {
		    System.out.print("Enter name, empty will end: ");
		    name1 = scan.nextLine();
		    if (name1.isEmpty()) {
		        break;
		    }
    	
		    System.out.print("Enter the age of the person " + name1 + ": ");
		    age1 = Integer.valueOf(scan.nextLine());
		    persons.add(new Person(name1, age1));
    }
			System.out.println();
			System.out.println("Total number of persons: " + persons.size());
			System.out.println("Persons: ");
            
			for (Person person: persons) {
			    System.out.println(person);
			    
		}
    }
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

	 @Override
	    public String toString() {
	        return this.name + ", age " + this.age + " years";
	}

	
   
	
    
  
}