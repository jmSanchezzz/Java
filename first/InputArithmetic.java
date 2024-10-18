package first;

import java.util.Scanner;

public class InputArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix to generate: ");
		n = sc.nextInt();
		int[][] matrix = new int[n][n];
		int row = n - 1, col = 0, num = 1, adder = 1;
		while (row >= 0) {
		for (int j = 0; j < n; j++) {
		matrix[row][col] = num;
		num += 1;
		col = col + adder;
		}
		if (adder == 1) {
		adder = -1;
		col = n - 1;
		} else {
		adder = 1;
		col = 0;
		}
		row -= 1;
		}
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		System.out.printf("%-3d ",matrix[i][j]);
		}
		System.out.println();
		}
		}
		}