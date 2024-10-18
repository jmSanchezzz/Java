package first;
import java.util.Scanner;
import java.text.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		int[] array = {5, 1, 3, 4, 2};
		printArrayInStars(array);
	}
	public static void printArrayInStars(int[] array) {
		for(int j = 0;j<array.length;j++) {
			for(int i = 0; i<=array[j];i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
