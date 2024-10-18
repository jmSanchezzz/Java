package classInList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);		
		        System.out.println("Gift: " + book);
		        Gift book2 = new Gift("The Amazing SpiderMan", 5);
		        Package gifts = new Package();
		        gifts.addGift(book);
		        gifts.addGift(book2);
		        System.out.println(gifts.totalWeight());
		    }
}

