package JavaMatrix;

public class Ex11_Transport {

	public static void main(String[] args) {
		int a[][] ={{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		int b[][]=new int [3][3];


		 /*     r/c |j-> 0  1  2            
			 * ------------------------------------
			 *i->0   |  1[00]  2[01]  3[02] | ----->  | 1[00]  4[01]  7[02]|   
			 * 	1   |   4[10]  5[11]  6[12] | ----->  | 2[10]  5[11]  8[12]|   
			 * 	2   |   7[20]  8[21]  9[22] | ----->  | 3[20]  6[21]  9[22]|   
			 * ------------------------------------
			 */	
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[j][i]=a[i][j];
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
