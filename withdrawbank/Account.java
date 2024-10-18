package withdrawbank;
import java.text.*;
import java.util.*;
public class Account {
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("$#.00");
	private double balance;
	private double withdraw;
	private String accountName;
	public Account(double balance, String accountName) {
		this.balance = balance;
		this.accountName = accountName;
	}
	public void debit() {
		System.out.printf("\nEnter withdrawal amount for %s: ",accountName);
		withdraw = scan.nextInt();
		if(withdraw>balance) {
			System.out.printf("%nSubtracting %.2f from %s%n",withdraw,accountName);
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			balance-=withdraw;
			System.out.printf("%nSubtracting %.2f from %s%n",withdraw,accountName);
		}
	}
	public String toString() {
		return  accountName + " balance: " +df.format(balance);
	}
}
