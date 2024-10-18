package intermProgAct1;
import java.util.*;
import intermProgAct1.Studentinfo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Student Name: ");
		String name=scan.nextLine();
		System.out.print("Age: ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.print("Student Gender [M/F]: ");
		char gender = scan.next().charAt(0);
		scan.nextLine();
		
		System.out.print("Student Address: ");
		String address = scan.nextLine();
		System.out.print("Contact Number: ");
		int contact = scan.nextInt();
		scan.nextLine();
		System.out.print("Father's Name: ");
		String father = scan.nextLine();
		System.out.print("Mother's Name: ");
		String mother = scan.nextLine();
		
		Studentinfo student1 = new Studentinfo(name,age,gender,address,contact,father,mother);
		System.out.println("STUDENT DETAILS");
		student1.display_student();
	}

}
