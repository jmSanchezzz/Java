package first;

public class method {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		printmethod();
		System.out.println("Java Border");
		printmethod();
	}
    public static void printmethod()
    // public is an access modifier
    //static is a method type (1)
    //void - returning data type
    // printmethod - method name
    //  () - parameter or argument
    {
    	int x;
    	for(x=1;x<5;x++)
    	{
    		System.out.print("==");
    	}
    	System.out.println();
    }*/
	
	public static void main(String[] args)
	{
	double diameter = 120.0;
	double radius = 0.0;
	String output = "";
	radius = diameter/2.0;
	output += "Circumference is ";
	output += solveCircumference(radius);
	output += " mm";
	output += "\nSurface area of CD is ";
	output += solveAreaCD(solveAreaCircle(radius),
	solveAreaCircle((diameter*0.125)/2.0));
	output += " sqr mm";
	System.out.println(output);
	}
	public static double solveCircumference(double rad)
	{
	return 2.0 * 3.1416 * rad;
	}
	public static double solveAreaCircle(double r)
	{
	return 3.1416 * r * r;
	}
	public static double solveAreaCD(double outer, double inner)
	{
	return outer - inner;
	}
	}


