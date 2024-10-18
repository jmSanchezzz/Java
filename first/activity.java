package first;
import java.util.*;

public class activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter matrix to generate: ");
		int size = scan.nextInt();
		int matrix = size*size;
		
		for(int i = 1; i<=size; i++) {
			for(int j = 1, r = matrix; j<=size; j++)
				if(i%2 != 0) {
					r = r - size*i-size;
					System.out.print(r + " ");
					size++;
				}else {
						r = r - size*i;
						System.out.print(r + " ");
						
					}
				System.out.println();
			
			
			
			
		}
	
		
		}
		
	}

