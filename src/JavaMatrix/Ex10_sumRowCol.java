package JavaMatrix;

public class Ex10_sumRowCol {

	public static void main(String[] args) {
		int a[][] ={{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		int rowSum=0;
		
		 /*     r/c |j-> 0  1  2     0  1  2   
			 * ------------------------------------
			 *i->0   |  1  3  2 | | 2  1  1|   -----> 
			 * 	1   |   3  1  1 | | 1  0  1|   ----->
			 * 	2   |   1  2  2 | | 1  3  1|   ----->
			 * ------------------------------------
			 */	
		
		for(int i=0;i<3;i++) {
			int sum=0,sum1=0;
			for(int j=0;j<3;j++) {
				sum=sum+a[i][j];
				if(j==2)
					System.out.println("Sum of Row "+(i+1)+" is: "+sum);
				sum1=sum1+a[j][i];
				if(j==2)
					System.out.println("Sum of Column "+(i+1)+" is: "+sum1);
					
			}
		}


	}

}
