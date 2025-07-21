package JavaBasicPrograms;

public class Ex05_ArmstrongNumber {

	public static void main(String[] args) {

		isArmstrong(153);
		isArmstrong(125);
		isArmstrong(1634);
		

	}

	private static void isArmstrong(int num) {
		int length = Integer.toString(num).length();
		int sum = 0;
		int temp = num;

		while (temp > 0) {
			int lastDigit = temp % 10;
			sum = sum + NumberRaiseToPowerOf(lastDigit, length);
			temp = temp / 10;
		}

		if (sum == num)
			System.out.println(num + " is Armstrong Number");
		else
			System.out.println(num + " is not Armstrong Number");

	}

	public static int NumberRaiseToPowerOf(int num, int power) {

		// 2^5=2*2*2*2*2;
		int sum = 1;
		for (int i = power; i > 0; i--) {
			sum = sum * num;
		}
		return sum;
	}

}
