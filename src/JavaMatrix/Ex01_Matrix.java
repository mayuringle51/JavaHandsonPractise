package JavaMatrix;

public class Ex01_Matrix {

	public static void main(String[] args) {
		
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}

	}

}
