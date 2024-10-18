package clock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();

		while (true) {
		    System.out.println(clock);
		    clock.advance();
		}

	}

}
