package intermediateProg;
import intermediateProg.Oop1sub;
public class Oop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic class MainProgram {
	        Oop1sub paulscard = new Oop1sub(20);
	        Oop1sub mattscard = new Oop1sub(30);
	        paulscard.eatHeartily();
	        mattscard.eatAffordably();
	        System.out.println("Paul: "+paulscard);
	        System.out.println("Matt: "+mattscard);
	        paulscard.addMoney(20);
	        mattscard.eatHeartily();
	        System.out.println("Paul: "+paulscard);
	        System.out.println("Matt: "+mattscard);
	        paulscard.eatAffordably();
	        paulscard.eatAffordably();
	        mattscard.addMoney(50);
	        System.out.println("Paul: "+paulscard);
	        System.out.println("Matt: "+mattscard);
	    }
	

	}


