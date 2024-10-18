package separatingUserInterfaceFromProgramLogic;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ToDoList list = new ToDoList();
		UserInterface ui = new UserInterface(list,scan);
		ui.start();
	}

}
