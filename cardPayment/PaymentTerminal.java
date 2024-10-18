package cardPayment;

public class PaymentTerminal {
	private double money;  // amount of cash
    private int affordableMeals=0; // number of sold affordable meals
    private int heartyMeals=0;  // number of sold hearty meals
    public PaymentTerminal() {
        // register initially has 1000 euros of money
    	this.money=1000;
    }
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    	if(card.balance()>=2.5) {
    		affordableMeals++;
    		return card.takeMoney(2.5);
    		
    	}
    	return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    	if(card.balance()>=4.3) {
    		heartyMeals++;
    		return card.takeMoney(4.3);
    	}
    	return false;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    	if(payment>=2.5) {
    		payment-=2.5;
    		money+=2.5;
    		affordableMeals++;
    		return payment;
    	}
    	return payment;
    	
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    	if(payment>=4.3) {
    		payment-=4.3;
    		money+=4.3;
    		heartyMeals++;
    		return payment;
    		
    	}
    	return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

