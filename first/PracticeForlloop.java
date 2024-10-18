package first;
import java.util.Scanner;

public class PracticeForlloop {

	private static String passwords[];

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	String[] userNames = { "Zeinahbebe", "Johnpogi", "Thereseanglet", "Marc32", "Zeinmarcporeber"};
    String[] passwords = { "2606z", "0626j", "2632z", "3226j", "3227z"};
	
	
	System.out.print("Enter username: ");
	String username = scan.nextLine();
	System.out.print("Enter password: ");
	String password = scan.nextLine();
	boolean isExist = false;
	
	for(int j = 0; j < userNames.length; j++)
		{
		if(userNames[j].equals(username) && passwords[j].equals(password)) {
			isExist = true;
			break;
		}	
		}
		if(isExist = true)	System.out.print("welcome " + username);
		else System.out.print("Accountr Not Found");
			
		}
	}
