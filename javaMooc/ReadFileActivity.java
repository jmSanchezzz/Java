package javaMooc;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadFileActivity {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList <>();
		 Scanner scan = new Scanner(System.in);
		 System.out.println("File to search:");
		 String fileName = scan.nextLine();
		 System.out.println("What team?");
		 String team = scan.nextLine();
		 System.out.println("Games: "+gamesPlayed(fileName,team));
		 winsLosses(fileName,team);
	}	 
		public static int gamesPlayed (String fileName, String teamName) {
			String details, array[];
			int games = 0;
			try {
				Scanner scanner = new Scanner(Paths.get(fileName));
				while(scanner.hasNextLine()) {
				details = scanner.nextLine();
				array = details.split(",");
				if(array[0].equalsIgnoreCase(teamName) || array[1].equalsIgnoreCase(teamName)) {
					games++;
				}	
		}
			} catch (IOException e) {
				System.out.println("Reading the file "+fileName +" failed.");
				System.exit(0);
			} 
				 return games;		
	}
		public static void winsLosses (String fileName, String teamName) {
			String details, array[];
			int wins = 0, loss = 0;
			try {
				Scanner scanner = new Scanner(Paths.get(fileName));
				while(scanner.hasNextLine()) {
				details = scanner.nextLine();
				array = details.split(",");
				if(array[0].equalsIgnoreCase(teamName) && Integer.valueOf(array[2])>Integer.valueOf(array[3])) {
					wins++;
				}
				else if(array[1].equalsIgnoreCase(teamName) && Integer.valueOf(array[3])>Integer.valueOf(array[2])) {
					wins++;
				}
				if(array[0].equalsIgnoreCase(teamName) && Integer.valueOf(array[2])<Integer.valueOf(array[3])) {
					loss++;
				}
				else if(array[1].equalsIgnoreCase(teamName) && Integer.valueOf(array[3])<Integer.valueOf(array[2])) {
					loss++;
				}
		}
			} catch (IOException e) {
				System.out.println("Reading the file "+fileName +" failed.");
				System.exit(0);
			} 
				System.out.printf("Wins: %d %nLosses: %d",wins,loss);
	}
	}