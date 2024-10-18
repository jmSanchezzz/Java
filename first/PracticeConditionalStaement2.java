package first;
import java.util.Scanner;

public class PracticeConditionalStaement2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Mathematics grade: ");
		int grade1 = scan.nextInt();
		System.out.print("Enter English grade: ");
		int grade2 = scan.nextInt();
		System.out.print("Enter Filipino grade: ");
		int grade3 = scan.nextInt();
		System.out.print("Enter Science grade: ");
		int grade4 = scan.nextInt();
		System.out.print("Enter Physics grade: ");
		int grade5 = scan.nextInt();
		
		double grade = ((grade1+grade2+grade3+grade4+grade5)/5);
		System.out.println("Grade	: " + grade );
		
		if (grade>100) System.out.println("Invalid grade");
		else if (grade>=98) System.out.println("With Highest Honors");
		 if (grade >= 95) System.out.println("With High Honors");
		 if (grade >= 95) System.out.println("With Honors");
		 if (grade >= 75 ) System.out.println("Passed");
		 else System.out.print("Failed");
			
		}
		

}

