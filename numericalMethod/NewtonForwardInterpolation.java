package numericalMethod;

import java.util.Scanner;

public class NewtonForwardInterpolation {
    static double newtonsForwardDifference(double x[], double y[], double value) {
        double result = 0; // Initialize result
        int i;
        double x0 = 0;
        for (i = 0; i < x.length - 1; i++) {
            if (value >= x[i] && value <= x[i + 1]) {
                x0 = x[i];
                break;
            }
        }
        // Calculate forward difference interpolation
        double h = x[1] - x[0]; // Assuming equally spaced x values
        double p = (value - x0) / h; // Calculate p

        // Calculate forward difference using the given formula
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
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Newton's Forward Difference Program\n");
    	System.out.print("Enter the number of x values: ");
        int n = scan.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];
        System.out.println("Enter the value for xi:");
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scan.nextDouble();
        }
        System.out.println("Enter the value for yi:");
        for (int i = 0; i < n; i++) {
            System.out.print("y[" + i + "]: ");
            y[i] = scan.nextDouble();
        }
        System.out.println("Enter the value of x to interpolate: ");
        double value = scan.nextDouble(); 
         
        double interpolationResult = newtonsForwardDifference(x, y, value);
        System.out.printf("f(%.1f) = %.3f",value, interpolationResult);
    }
}