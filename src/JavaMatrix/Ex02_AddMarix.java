package JavaMatrix;

public class Ex02_AddMarix {

	public static void main(String[] args) {
		
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] matrixNew = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Matrix 1");
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2");
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(matrixNew[row][col]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Matrix Addition");
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print((matrixNew[row][col])+(matrixNew[row][col])+" ");
			}
			System.out.println();
		}
		
		

	}

}
