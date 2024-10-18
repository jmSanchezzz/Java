package javaMooc;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
public class ReadFileText {

	public static void main(String[] args) {
	 ArrayList<String> list = new ArrayList <>();
	 Scanner scan = new Scanner(System.in);
	 System.out.println("File to search:");
	 String fileName = scan.nextLine();
	 System.out.println("Search for: ");
	 String name = scan.nextLine();
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(Paths.get(fileName));
			while(scanner.hasNextLine()) {
					list.add(scanner.nextLine());
	}
		} catch (IOException e) {
			System.out.println("Reading the file "+fileName +" failed.");
			System.exit(0);
		} 
		if(list.contains(name)) {
			System.out.println("Found!");
		}
		else if(!list.contains(name)) {
			System.out.println("Not Found!");
		}
				

}
}

