package objectOriented_comand;

public class Container {
	private int amount;
	
	public Container() {
		
		
	}
	
	public int contains() {
		return amount;
	}
	public void add(int amount) {
		if(amount>0) {
			if(amount+this.amount>100) {
				this.amount=100;
			}
			else {
		    this.amount+=amount;
			}
		}
	}
	public void remove(int amount) {
		if(amount>0) {
			if(this.amount-amount<0) {
				this.amount=0;
			}
			else {
			this.amount-=amount;
			}
		}
	}
	
	public void move(Container destination,int amount) {
		if(amount>this.contains()) {
			amount = this.contains();
			destination.add(amount);
			this.remove(amount);
			
		}
		else {
			this.remove(amount);
			destination.add(amount);
		}
		
		
	}
	public String toString() {
		return this.amount + "/100";
	}
}
