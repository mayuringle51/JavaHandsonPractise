package level01_Exercise;

public class Ex03_ReverseNumber {

	public static void main(String[] args) {

		reverseNumber(54321);

	}

	private static void reverseNumber(int orignalNum) {

		int temp = orignalNum;
		int sum = 0;

		while (temp > 0) {
			// 54321
			int lastDigit = temp % 10; // 1 2
			sum = sum * 10 + lastDigit;// 0+1=
			temp = temp / 10;// 5432

		}

		System.out.println(sum);

	}

}
