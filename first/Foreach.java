package first;
import java.util.*;

public class Foreach {

	public static void main(String[] args) {
		 Scanner scan =  new Scanner(System.in);

		 System.out.print("Enter a number: ");
	        long integer = scan.nextLong();
	        int sum = 0;
	        for(long digit = 0;integer>0;integer/=10){
	        	digit = integer%10;
	      if(digit%2==0) sum+=digit;

	            
	        System.out.print("The sum of even digits is "+sum);







	    }
	}