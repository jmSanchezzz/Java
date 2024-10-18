package first;

public class TwodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integers[][] = {
				              {1,2,3,4},
				              {5,6,7,8},
				              {7,4,6,3}
				
					    	};
		for(int col = 0, counter = 1; col< integers.length;col++, counter++) {
			int row = 0,sum= 0;
			while(row< integers.length) {
			 sum+=integers[row][col];
			 row++;
			 
		 }
			
			System.out.println("Sum of Column"+counter +" : "  +sum);
		}

	}

}
