package first;

import java.util.Scanner;


public class Challenge3arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String Email[] = { "Zeinah@gmail.com", "John@gmail.com", "Therese@gmail.com", "Marc@gmail.com", "Zeinmarc@gmail.com"};
		String Username[] = { "Zeinahbebe", "Johnpogi", "Thereseanglet", "Marc32", "Zeinmarcporeber"};
		String Password[] = { "2606", "0626", "2632", "3226", "3227"};
		int z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Account Number: ");
		z= scan.nextInt();
		
		
		
		System.out.println("Index     : " + z);
		System.out.println("Email    : " + Email[z]);
		System.out.println("Username : " + Username[z]);
		System.out.println("Password : " + Password[z]);
		
	
		
		
		
	}
	

}
