package JavaMatrix;

public class Ex08_FrequencyOfOddEven {

	public static void main(String[] args) {
		int row, col, even=0, odd=0;
		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 8, 6, 4 }, { 4, 5, 6 } };
		row=a.length;
		col=a[0].length;
		
		if(row!=col)
			System.out.println("Matrix should be square");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]%2==0)
					even++;
				else
					odd++;
			}
			
		}
		
		System.out.println("Frequency of ODD "+odd);
		System.out.println("Frequency of Even "+even);

	}

}
