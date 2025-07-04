package level01_Exercise;

public class Ex06_Factorial {

	public static void main(String[] args) {
		
		//5! = 5 * 4 * 3 * 2 * 1
		findFactorial(5);
	}

	private static void findFactorial(int num) {
		
		int temp=num;
		int mul=1;
		
		while(temp>0) {
			
			mul=mul*temp;
			temp--;
		}
		
		System.out.println("Factoial of "+num+" is "+mul);
		
	}

}