package withdrawbank;
public class AccountRun {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Account account1 = new Account(150.00,"account1");
		Account account2 = new Account(500.53,"account2");
		
		System.out.println(account1);
		System.out.println(account2);
		
		account1.debit();
		System.out.println(account1);
		System.out.println(account2);
		account2.debit();
		
		System.out.println(account1);
		System.out.println(account2);

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
