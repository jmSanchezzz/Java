package first;

public class $tring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String text = "1 second third fourth";
		String[] pieces = text.split(" ");
		System.out.println(pieces[0]);
		System.out.println(pieces[1]);
		System.out.println(pieces[2]);
		System.out.println(pieces[3]);

		System.out.println();
       
		for (int i = 0; i < pieces.length; i++) {
		    System.out.println(pieces[i]);
		*/
		String s1 = "Zein Marc";
		char [] z = s1.toCharArray();
		System.out.print(z[0]);
		
		String s2 = "pogiko";
		String replace = s2.replaceAll("o","a");
		System.out.println(replace);
	
		  String s = "123456789";
		    StringBuilder x = new StringBuilder(s);
		    x.reverse();
		    String output = x.toString();
		    
			System.out.println(output);
			String orig = "Zeinmarc";
			
			for(int i = orig.length()-1;i>=0;i--) {
				System.out.print(orig.charAt(i));
				
			}


	}

	
	}
	
	
	


//text.contains("can")
// if(Integer.valueOf(pieces[0])==0)
//string.length