package methodAsPArameters;
import java.lang.Math;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
 

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compare) {
    	if(this.squares>compare.squares) {
    		return true;
    	}
    	return false;
    	
    }
   
    public int priceDifference(Apartment compared) {
    	return Math.abs(this.squares*this.pricePerSquare-compared.squares*compared.pricePerSquare);
    	
    }
    public boolean moreExpensiveThan(Apartment compared) {
    	if(this.squares*this.pricePerSquare>compared.squares*compared.pricePerSquare) {
    		return true;
    	}
    	return false;
    	
    }
}