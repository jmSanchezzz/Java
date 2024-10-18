package javaMooc;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileInt {

	public static void main(String[] args) { ArrayList<String> list = new ArrayList <>();
	 Scanner scan = new Scanner(System.in);
	 System.out.println("File to search:");
	 String fileName = scan.nextLine();
	 System.out.print("Lower Bound: ");
	 int lowerBound = Integer.valueOf(scan.nextLine());
	 System.out.print("Upper Bound: ");
	 int upperBound = Integer.valueOf(scan.nextLine());
	 int counter = 0, input;
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(Paths.get(fileName));
			while(scanner.hasNextLine()) {
				input = Integer.valueOf(scanner.nextLine());
					if(input>=lowerBound && input<=upperBound) {
						counter++;
					}
	}
		} catch (IOException e) {
			System.out.println("Reading the file "+fileName +" failed.");
			System.exit(0);
		} 
		System.out.println("Numbers: "+ counter);
	

}
}

