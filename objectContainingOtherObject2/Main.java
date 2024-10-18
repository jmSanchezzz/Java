package objectContainingOtherObject2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdList birdList = new BirdList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Commands");
			System.out.println("Add - adds a bird\r\n"
					+ "Observation - adds an observation\r\n"
					+ "All - prints all birds\r\n"
					+ "One - prints one bird\r\n"
					+ "Quit - ends the program");
		while(true) {
			System.out.println("?");
			String command = scan.nextLine();
			if(command.equalsIgnoreCase("quit")) {
				
				break;
			}
			else if(command.equalsIgnoreCase("add")) {
				System.out.println("Name: ");
				String name = scan.nextLine();
				System.out.println("Name in Latin: ");
				String latinName = scan.nextLine();
				Bird bird = new Bird(name,latinName);
				birdList.add(bird);
			}
			else if(command.equalsIgnoreCase("observation")) {
				System.out.print("Bird:");
				String name = scan.nextLine();
				birdList.observation(name);
			}
			else if(command.equalsIgnoreCase("all")) {
				birdList.print();
			}
			else if(command.equalsIgnoreCase("one")) {
				System.out.print("Bird:");
				String name = scan.nextLine();
				birdList.printOne(name);
			}
		}
		

	}

}
