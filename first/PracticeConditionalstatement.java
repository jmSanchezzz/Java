package first;
import java.util.Scanner;
import java.text.DecimalFormat;
		


public class PracticeConditionalstatement {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    DecimalFormat dfrmt = new DecimalFormat();
		    dfrmt.setMinimumFractionDigits(2);

		    System.out.print("Enter purchase amount: ");
		    double purchaseAmount = scan.nextDouble();


	        double discount;

	        if (purchaseAmount < 100) {
	            discount = 0;
	        } else if (purchaseAmount <= 500) {
	            discount = purchaseAmount * 0.1;
	        } else {
	            discount = purchaseAmount * 0.2;
	        }
			
	        double finalAmount = purchaseAmount - discount;
	        
	        System.out.println("Discount : " + dfrmt.format(discount));
	        System.out.print("Final Amount: "  + dfrmt.format(finalAmount));
		    
		        
		
		
		
		

	}

}
