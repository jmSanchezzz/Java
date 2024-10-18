package separatingUserInterfaceFromProgramLogic2;
import java.util.*;
public class UserInterface {
	GradeRegister register;
    private Scanner scan;
    
    public UserInterface(GradeRegister register, Scanner scan) {
    	this.register = register;
    	this.scan = scan;
    }
    public void start() {
    	readPoints();
    	System.out.println("");
    	printGradeDistribution();
    	System.out.println("The average of points: "+register.averageOfPoints());
    	System.out.println("The average of grades: "+register.averageOfGrades());
    }
    public void readPoints() {
    	
    	while(true) {
    	System.out.print("Points: ");
    	String input = scan.nextLine();
    	if (input.isBlank()) {
    		break;
    	}
    	int points = Integer.valueOf(input);
    	if(points>100 || points<0) {
    		System.out.println("Impossible number");
    	}
    	this.register.addGradeBasedOnPoints(points);
    	
    	}
    }
    public void printGradeDistribution() {
    	int grade = 5;
    	while(grade>0) {
    		int stars = register.numberOfGrades(grade);
    		System.out.print(grade + ": ");
    		printStars(stars);
    		System.out.println();
    		grade--;
    		
    	}
    }
    public void printStars(int stars) {
    	while(stars>0) {
    		System.out.print("*");
    		stars--;
    	}
    }

}
