package JavaBasicPrograms;

public class Ex02_primeNumber {

	public static void main(String[] args) {

		/*
		 * A prime number is a number that is greater than 1 and divided by 1 or itself.
		 * In other words, prime numbers cannot be divided by other than itself or 1.
		 * 
		 * For example, 2, 3, 5, 7, 11, 13, 17... are the prime numbers.
		 */

		isPrime(1);
	}

	private static void isPrime(int num) {
		int flag = -1;
		if(num>1) {
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not Prime Number");
				flag = 1;
				break;
			}
		}

		if (flag == -1)
			System.out.println(num + " is Prime Number");
	}
	else
		System.out.println("Enter Valid Number");
	}
}
