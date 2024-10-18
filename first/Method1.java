package first;

public class Method1 {
	public static final int add(int b1, int a1) {
		return a1+b1;
	}
	public static final int sqr(int x) {
		int s;
		s = x*x;
		return s;
		//return value of s to sqr
	}
	public static void main(String[] args) {
		int a = 4, b = 5;
		System.out.println(add(a,b));
		System.out.println(Math.sqrt(add(a,b)));
		System.out.println(sqr(add(a,b)));
		System.out.println(Math.pow(sqr(add(a,b)),2));
		// TODO Auto-generated method stub

	}

}
