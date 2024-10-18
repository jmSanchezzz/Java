package numericalMethod;
import java.text.DecimalFormat;
import java.util.*;
public class LagrangeInterpolation {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("##,###.000");
	static int n;
	static double[] x;
	static double[] y;
	static double xValue;

	public static void main(String[] args) {
		System.out.println("Lagrange Interpolation and Newton's Forward Difference Program\n");
		while (true) {
			System.out.print(
					"What do you want to solve? \n[1] Newton's Forward Difference \n[2] Lagrange Interpolation\n[3] Exit\nEnter[1,2,3].. ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1:
				System.out.println("\nNEWTON'S FORWARD DIFFERENCE\n");
				initializeValues();
				double interpolationResult = newtonsForwardDifference(x, y, xValue);
				System.out.printf("f(%.1f) = %.3f\n", xValue, interpolationResult);
				System.out.println();
				break;
			case 2:
				System.out.println("\nLAGRANGE INTERPOLATION\n");
				initializeValues();
				printTable(x, y);
				double interpolatedValue = interpolate(x, y, xValue);
				System.out.println("\nf(" + xValue + ") = " + df.format(interpolatedValue));
				System.out.println();
				break;
			case 3:
				System.out.println(
						"\nProgrammed by Sanchez,John Marc\nNumerical Methods\n1BSCS-2\nSubmitted to Prof. Corazon Quintana");
				System.exit(0);
				break;
			}
		}

	}

	public static void initializeValues() {
        System.out.print("Enter the values for x :");
        String[] valuesX = scan.nextLine().split("\\s+");
        x = new double[valuesX.length];
        for (int i = 0; i < valuesX.length; i++) {
            x[i] = Double.parseDouble(valuesX[i]);
        }

        System.out.print("Enter the values for y :");
        String[] valuesY = scan.nextLine().split("\\s+");
        y = new double[valuesY.length]; 
        for (int i = 0; i < valuesY.length; i++) {
            y[i] = Double.parseDouble(valuesY[i]);
        }

        System.out.print("\nEnter the value of x to interpolate: ");
        xValue = scan.nextDouble();
    }

	public static double interpolate(double[] x, double[] y, double givenX) {
		double result = 0;
		System.out.println();
		// Calculate the interpolation for each data point
		for (int i = 0; i < x.length; i++) {
			double term = y[i];
			String lagrangePolynomial = "Y" + "(" + (i + 1) + ")" + " = " + term;
			// Compute the Lagrange basis polynomial for the i-th data point
			for (int j = 0; j < x.length; j++) {
				if (j != i) {
					double numerator = givenX - x[j];
					double denominator = x[i] - x[j];
					term *= numerator / denominator;
					lagrangePolynomial += " * (" + givenX + " - " + x[j] + ")" + " / " + "(" + x[i] + " - " + x[j]
							+ ")";
				}
			}
			result += term;
			lagrangePolynomial += "\n= " + df.format(term);
			System.out.println(lagrangePolynomial);
		}
		return result;
	}

	public static void printTable(double x[], double y[]) {
		System.out.println();
		System.out.print("xi ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.print("\nyi ");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
	}

	static double newtonsForwardDifference(double x[], double y[], double value) {
		double result = 0;
		int i;
		double x0 = 0;
		for (i = 0; i < x.length - 1; i++) {
			if (value >= x[i] && value <= x[i + 1]) {
				x0 = x[i];
				break;
			}
		}
		// Calculate forward difference interpolation
		double h = x[1] - x[0];
		double p = (value - x0) / h; // Calculate p

		// Calculate forward difference using the formula
		result = y[i];
		double tempP = p;
		for (int j = 1; j <= i; j++) {
			result += (tempP * calculateDeltaY(y, j, i)) / factorial(j);
			tempP *= (p - j);
		}
		printForwardDifferenceTable(x, y);
		return result;
	}

	static double factorial(int n) {
		double fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	static double calculateDeltaY(double y[], int i, int n) {
		if (i == 1)
			return y[n] - y[n - 1];
		else
			return calculateDeltaY(y, i - 1, n) - calculateDeltaY(y, i - 1, n - 1);
	}

	static void printForwardDifferenceTable(double x[], double y[]) {
		System.out.println("Forward Difference Table:");
		System.out.printf("%10s  %10s ", "x", "y");
		for (int i = 1; i < y.length; i++) {
			System.out.printf(" %10s", "Δy" + i);
		}
		double[][] delta = new double[y.length][y.length];
		for (int i = 0; i < y.length; i++) {
			delta[i][0] = y[i];
		}

		for (int i = 1; i < y.length; i++) {
			for (int j = 0; j < y.length - i; j++) {
				delta[j][i] = delta[j + 1][i - 1] - delta[j][i - 1];
			}
		}
		System.out.println();
		for (int i = 0; i < y.length; i++) {
			System.out.printf("%10.2f  %10.2f ", x[i], y[i]);
			for (int j = 1; j < y.length - i; j++) {
				System.out.printf("%10.3f ", delta[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}