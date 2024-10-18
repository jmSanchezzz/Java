package javaMooc;
import java.util.*;
public class numberMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter matrix to generate: ");
		int num = scan.nextInt();
		int matrix = num*num;
		int matrix1 =matrix,i = 1;
		for(int row = 0   ; row<num;row++) {
			for(int col = 0;col<num;col++) {
				if (row%2==0 || row==0) {
					System.out.print(matrix+" ");
					matrix1--;
				}
				if (row%2!=0 ) {
					System.out.print(matrix1+" ");
					matrix1++;
				}
				matrix--;
			
			}
			matrix1-=4*i;
			matrix1++;
			i++;
			System.out.println();
		}
	}

}
