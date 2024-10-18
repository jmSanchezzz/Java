package intermediateProg;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Paths;
import java.util.*;
public class ScanTextFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = scan.nextLine();
		scantext(fileName);

	}

	public static void scantext(String fileName) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(Paths.get(fileName));
			while(scanner.hasNextLine()) {
					String row = scanner.nextLine();
					System.out.println(row);
	}
		} catch (IOException e) {
			System.out.println("Error "+e);
		} 
				

}
}

