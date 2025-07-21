package JavaBasicPrograms;

public class Ex04_Factorial {

	public static void main(String[] args) {

		FindFactorial(5);

	}

	private static void FindFactorial(int num) {
		int mul = 1;
		for(int i = num; i > 0; i--) {
			mul = mul * i;
		}
		System.out.println("Factorial of " + num + " is " + mul);

	}

}
