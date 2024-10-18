package intermediateProg;

public class Quiz1Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, num=9;
		String me="th";
		number = value(num);
		System.out.println(num +me+" value is "+number);
		} 
	    static int value(int pass) {
		if(pass==1)
		 return 0;
		if(pass==2)
		return 1;
		return value(pass-1)+value (pass-2);
		}

	}


