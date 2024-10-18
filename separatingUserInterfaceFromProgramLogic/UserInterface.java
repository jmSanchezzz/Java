package separatingUserInterfaceFromProgramLogic;
import java.util.*;
public class UserInterface {
	private Scanner scanner;
	private ToDoList list;
	public UserInterface(ToDoList list, Scanner scanner) {
		this.scanner = scanner;
		this.list = list;
	}
	public void start() {
		while(true) {
			System.out.print("command: ");
			String command = scanner.nextLine();
			if(command.equalsIgnoreCase("add")) {
				System.out.print("To add:");
				String task = scanner.nextLine();
				list.add(task);
			}
			else if(command.equalsIgnoreCase("stop")){
				break;
			}
			else if(command.equalsIgnoreCase("list")) {
				list.print();
			}
			else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Which one is removed?");
				int number = scanner.nextInt();
				list.remove(number);
			}
			else {
				System.out.println("Invalid command");
			}
		}
	}

}
