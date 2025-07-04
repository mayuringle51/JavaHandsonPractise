package level01_Exercise;

public class Ex01_SwapTwoNumbers {

	public static void main(String[] args) {

		swapNumber(15, 25);
		swapWithoutThirdVariable(50, 70);
	}

	public static void swapWithoutThirdVariable(int num1, int num2) {
		System.out.println("Before Swapping : Num 1->" + num1 + " Num 2->" + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After Swapping : Num 1->" + num1 + " Num 2->" + num2);
	}

	public static void swapNumber(int num1, int num2) {

		System.out.println("Before Swapping : Num 1->" + num1 + " Num 2->" + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After Swapping : Num 1->" + num1 + " Num 2->" + num2);

	}

}
