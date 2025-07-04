package level01_Exercise;

public class Ex02_PrimeNumber {

	public static void main(String[] args) {
		
		if (isPrime(11))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(15))
            System.out.println(" true");
        else
            System.out.println(" false");
		
		
	}

	private static boolean isPrime(int num) {
		boolean flag=true;

		if(num<=1)
			return false;
		
		//check from 2 to n-1
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
				return false;
		}
		
		return flag;
	}

}
