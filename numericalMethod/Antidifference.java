package numericalMethod;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Antidifference {
	public static String symbolicAntidifference(int m) {
		if (m == 1) {
			return "ln(x) + C";
		} else {
			return "x^(" + ((-m) + 1) + ") / (" + (m - 1) + ") + C";
		}
	}

	public static double antidifference(double x, int m) {
		if (m == 1) {
			return Math.log(x);
		} else {
			return Math.pow(x, -m + 1) / (m - 1); // anti-differencing of x^−m is x^−(m-1)/(m-1) for m≠1.
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##,###.000");
		System.out.println(
				"Anti-Differencing Program\n(A simple program for Anti-differencing of x^-m where m is 0,1,2,3,4,....,20 .)\n");
		System.out.print("Do you want to enter a value for x? (yes/no): ");
		String choice = scanner.nextLine().toLowerCase();

		if (choice.equals("yes")) {
			System.out.print("Enter the value of x: ");
			double x = scanner.nextDouble();

			for (int m = 0; m <= 20; m++) {
				double result = antidifference(x, m);
				System.out.println("m = " + m + ": x^(-" + m + ")= " + df.format(result));
			}
		} else if (choice.equals("no")) {
			for (int m = 0; m <= 20; m++) {
				String result = symbolicAntidifference(m);
				System.out.println("m = " + m + ": x^(-" + m + ")= " + result);
			}
		} else {
			System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
		}
	}
}