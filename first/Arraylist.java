package first;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		/*int i = 0;
		while(true) {
			  numbers.add(scan.nextInt());
			  if(numbers.get(i)==-1) {
				  break;
			  }
			i++;
		}
		System.out.print("From where?");
		int x = scan.nextInt();
		System.out.print("To where?");
		int y = scan.nextInt();
		for(int j = 0;j<numbers.size();j++) {
			if(numbers.get(j)>=x && numbers.get(j)<=y) {
				System.out.println(numbers.get(j));
			}*/
		
           //list.add
		   //list.get
		   //list.size
		   //list.contains
		  //list.remove(Integer.valueOf(15)
		int i = 0, index = 0;
		boolean check = true;
		
		while(check) {
			numbers.add(scan.nextInt());
			  if(numbers.get(i)==9999) {
				 check = false;
				  
			  }
			i++;
		}
		int smallest = numbers.get(0);
		int j =0;
	for(int z = 1; z<numbers.size();z++) {
		if(smallest>numbers.get(z)) {
			smallest = numbers.get(z);
		}
	}
		
		System.out.println("Smallest: " + smallest);
	}

}
