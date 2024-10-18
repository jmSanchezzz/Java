package objectOriented_comand;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Container container = new Container();
		Container container1 = new Container();
		while(true) {
			
			System.out.print("Command:");
			String command = scan.nextLine();
			if(command.equalsIgnoreCase("end")) {
				break;
			}
			if(command.equalsIgnoreCase("add")) {
				System.out.print("Enter amount to add:");
				container.add(scan.nextInt());
				System.out.println(container);
				System.out.println(container1);
				scan.nextLine();
				
			}
			if(command.equalsIgnoreCase("remove")) {
				System.out.print("Enter amount to remove:");
				container.remove(scan.nextInt());
				System.out.println(container);
				System.out.println(container1);
				scan.nextLine();
			}
			if(command.equalsIgnoreCase("move")) {
				System.out.print("Enter amount to move from container1 to 2:");
				container.move(container1,scan.nextInt());
				System.out.println(container);
				System.out.println(container1);
				scan.nextLine();
				
			}
		}
	}

}
