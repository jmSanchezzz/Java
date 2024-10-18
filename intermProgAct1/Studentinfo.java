package intermProgAct1;

public class Studentinfo {
	private String studentName, studentAddress, 
	fathersname, mothersname;
	private int age,contactno;
	private char gender;
	
	public Studentinfo(String name,int age,char gender,String address, int contact, String father, String mother ) {
		this.studentName=name;
		this.age = age;
		this.gender=gender;
		this.studentAddress=address;
		this.contactno=contact;
		this.fathersname=father;
		this.mothersname=mother;
	}
	public void display_student() {
		System.out.println("Student Name: "+ studentName);
		System.out.println("Age: "+ age);
		System.out.println("Student Gender: "+ gender);
		System.out.println("Student Address: "+ studentAddress);
		System.out.println("Contact Number: "+ contactno);
		System.out.println("Father's Name: "+ fathersname);
		System.out.println("Mother's Name: "+ mothersname);
	}
}
