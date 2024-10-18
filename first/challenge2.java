package first;

import java.util.Scanner;

public class challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter First Character: ");
	    char first = scan.next().charAt(0);
	    System.out.print("Enter Second Character: ");
	    char second = scan.next().charAt(0);
	    System.out.print("Enter Size: ");
	    int size = scan.nextInt();
	    char under = '_';
	    
	    for(int i = 1; i<=size;i++ ) {
	    	for(int j =1;j<=i-1;j++) {
	    		System.out.print("-");
	    	}
	    	if(i%2==0)System.out.print(first);
    		else System.out.print(second);
	    	 System.out.println();
	    	
	    	
	    	
	    	
	    	
	    }
			
		 
		
		
		
	}

}
