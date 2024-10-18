package separatingUserInterfaceFromProgramLogic2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeRegister register = new GradeRegister();
		Scanner scan = new Scanner(System.in);
		UserInterface ui = new UserInterface(register,scan);
		ui.start();
	}

}
