package first;
import java.util.Scanner;

public class Praccondi {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		char j;
		
		System.out.print("Enter character: ");
		j = scan.next().charAt(0);
		
		
		if((j>='a' && j<='z') ||  (j>='A' && j<='Z') || (j>='0' && j<='9'))
		{
	
		}
		else
		{
			System.out.print("Character is a special character");
		}
		
		
		
		
		
	}

}
