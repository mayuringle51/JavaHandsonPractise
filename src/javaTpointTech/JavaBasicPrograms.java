package javaTpointTech;

public class JavaBasicPrograms {

	public static void main(String[] args) {
		//fibonacciSeries();
		//isPrime(1);
		//isPalindrome("MOMOM");
		//findFactorial(5);
		//raiseToPower(2,4);
		
		//isArmStrongNumber(1);
		//isArmStrongNumber(2);
		//isArmStrongNumber(3);
		//isArmStrongNumber(153);
		//isArmStrongNumber(125);
		//isArmStrongNumber(1634);
		
		

	}
	
	
	

	private static void isArmStrongNumber(int num) {
		int orgNum=num;
		int length=Integer.toString(num).length();
		int sum=0;
		while(num>0) {
			int lastDigit=num%10;
			sum=sum+raiseToPower(lastDigit,length);
			num/=10;
		
		}
		if(orgNum==sum)
		System.out.println(orgNum+" is Armstrong Number");
		else
			System.out.println(orgNum+" is not Armstrong Number");
			
		
	}




	private static int raiseToPower(int num, int power) {
		int lengh=power;
		int sum=1;
		for(int i=power;i>0;i--) {
			sum=sum*num;
		}
		
		//System.out.println(num+" Raise to Power "+power+" is "+sum);
		return sum;
		
	}




	private static void findFactorial(int num) {
		int org=num;
		int sum=1;
		
		while(num>0) {
			sum=sum*num;
			num--;
			
		}
		
		System.out.println("Factorial of "+org+" is "+sum);
		
	}




	private static void isPalindrome(int num) {
		String str = Integer.toString(num);
		int length=str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev))
			System.out.println(str+" is Palindrome");
		else
			System.out.println(str+" is not Palindrome");
		
	}
		
	




	private static void isPalindrome(String str) {
		int length=str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev))
			System.out.println(str+" is Palindrome");
		else
			System.out.println(str+" is not Palindrome");
		
	}




	private static void isPalindrome() {
		// TODO Auto-generated method stub
		
	}




	private static void isPrime(int num) {
		int flag=0;		
		for(int i=2;i<num/2;i++) {
			
			if(num%i==0) {
				System.out.println(num+" is not Prime Number");
				flag=1;
				break;
				
			}
		}
		
		if(flag==0)
			System.out.println(num+" is Prime Number");
		
		
	}



	public static void fibonacciSeries() {
		int a = 0;
		int b = 1;

		for (int i = 0; i < 15; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
