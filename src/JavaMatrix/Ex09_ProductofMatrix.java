package JavaMatrix;

public class Ex09_ProductofMatrix {

	public static void main(String[] args) {
		
		 int a[][] ={{1,3,2},{3,1,1}, {1,2,2}};
		 int  b[][] ={{2,1,1},{1,0,1}, {1,3,1}};
		 int prod[][]=new int[3][3];
		 
		 int aRow=a.length;
		 int aCol=a[0].length;
		 int bRow=b.length;
		 int bCol=b[0].length;
		 
		 /*     r/c |  0  1  2     0  1  2   
			 * ------------------------------------
			 *  0   |  1  3  2 | | 2  1  1|   -----> 
			 * 	1   |  3  1  1 | | 1  0  1|   ----->
			 * 	2   |  1  2  2 | | 1  3  1|   ----->
			 * ------------------------------------
			 */			
		 
		 
		 
		 for(int i=0;i<aRow;i++) {
			 for(int j =0;j<bCol;j++) {
				 for(int k=0;k<bRow;k++) {
					 prod [i][j]=prod [i][j]+a[i][k]*b[k][j];
					 
					 				// a[0][0]*b[0][0];  -------> 1 * 2 
					 				//prod[0][0] = 2 
					 				// a[0][1]*b[1][0];  -------> 3 * 1
					                //prod[0][0] = 2 + 3 
					 				// a[0][2]*b[2][0];	 -------> 2 * 1
					 				//prod[0][0] = 2 + 3 + 2
					 				//----->7
					 
					 
					
					 
				 }
				 
			 }
		 }
		 
		 /****************************************************************/
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(prod[i][j] + " ");
				}
				System.out.println();
	}

}}
