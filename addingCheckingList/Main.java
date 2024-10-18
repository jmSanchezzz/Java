package addingCheckingList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> container = new ArrayList<>();
		while(true) {
			System.out.println("Identifier? (empty will stop)");
			String identifier = scan.nextLine();
			if(identifier.isEmpty()) {
				break;
			}
			System.out.println("Name? (empty will stop)");
			String name = scan.nextLine();
			if(name.isEmpty()) {
				break;
			}
			String format = identifier + " : " + name;
			if (!container.contains(format)) {
				container.add(format);
			}
		}
		for(String item : container) {
			System.out.println(item);
		}

	}

}
