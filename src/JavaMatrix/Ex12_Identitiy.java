package JavaMatrix;

public class Ex12_Identitiy {

	public static void main(String[] args) {
/* A matrix is said to be an identity matrix if it is a square matrix 
 * in which elements of principle diagonal are ones, 
 * and the rest of the elements are zeroes.
*/
		
	
		 /*     r/c |j-> 0  1  2            
			 * ------------------------------------
			 *i->0   |  1[00]  0[01]  0[02] |   
			 * 	1   |   0[10]  1[11]  0[12] |    
			 * 	2   |   0[20]  0[21]  1[22] |  
			 * ------------------------------------
			 */	
		

		int a[][] ={{1, 0, 0},{0, 1, 0}, {0, 0, 1}};
		int row=a.length;
		int col=a[0].length;
		boolean issue = false;
		if(row!=col)
			System.out.println("Matrix should be square");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j && a[i][j]!=1) {
					issue=true;
				break;}
				if(i!=j && a[i][j]!=0) {
					issue=true;
				break;}
					
			}
		}
		
		if(issue==false)
		System.out.println("Given Matrix is Identity Matrix");
		else
			System.out.println("Given Matrix is not Identity Matrix");
		
	}

}
