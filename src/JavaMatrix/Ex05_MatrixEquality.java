package JavaMatrix;

public class Ex05_MatrixEquality {

	public static void main(String[] args) {

		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] matrixNew = {{1,2,3},{4,5,6},{7,8,9}};
		boolean flag=false;
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(matrix[row][col]!=matrixNew[row][col]) {
					flag=true;
					break;
				}
			}
		
		}
		
		if(flag==false) {
			System.out.println("Both Matrix are equal");
		}

	}

}
