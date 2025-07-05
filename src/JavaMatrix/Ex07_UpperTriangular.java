package JavaMatrix;

public class Ex07_UpperTriangular {

	public static void main(String[] args) {
		int rows, cols;
		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 8, 6, 4 }, { 4, 5, 6 } };

		/*      row()/col |  0  1  2   
		 * ------------------------------------
		 *          0   |  1  2  3 |
		 * 	        1   |  8  6  4 |
		 * 			2   |  4  5  6 |
		 * ------------------------------------
		 * 
		 * Itration-->1(if(j>i print 0))
		 * i=0,j=0 ---->1 
		 * i=0,j=1 ---->2 
		 * i=0,j=2 ---->3
		 * 
		 * Itration-->2(if(j>i print 0))
		 * i=1,j=0 ---->0 
		 * i=1,j=1 ---->6 
		 * i=1,j=2 ---->4
		 * 
		 *  Itration-->3(if(j>i print 0))
		 * i=1,j=0 ---->0 
		 * i=1,j=1 ---->0 
		 * i=1,j=2 ---->6
		 * 
		 * 		/*      row()/col |  0  1  2   
		 * ------------------------------------
		 *          0   |  1  2  3 |
		 * 	        1   |  0  6  4 |
		 * 			2   |  0  0  6 |
		 * ------------------------------------
		 * */

		// Calculates number of rows and columns present in given matrix
		rows = a.length;
		cols = a[0].length;

		if (rows != cols)
			System.out.println("Matrix should be a square matrix");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i > j)
					a[i][j] = 0;

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
