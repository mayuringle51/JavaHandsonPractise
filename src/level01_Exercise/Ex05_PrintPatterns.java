package level01_Exercise;

public class Ex05_PrintPatterns {

	public static void main(String[] args) {
		NumberpyramidRightHalf();
		StarPyramidRightHalf();
		
		NumberpyramidLeftHalf();
		StarPyramidLeftHalf();

	}

	private static void StarPyramidLeftHalf() {
		
		
	}

	private static void NumberpyramidLeftHalf() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j<2*(5-i-1); j++) 
				System.out.print("");
			
			for(int k=0;k<=i;k++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

	private static void StarPyramidRightHalf() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// right half Star Pyramid
	public static void NumberpyramidRightHalf() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

}
