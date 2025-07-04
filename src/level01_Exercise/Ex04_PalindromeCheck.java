package level01_Exercise;

public class Ex04_PalindromeCheck {

	public static void main(String[] args) {
		isPalindrome(12321);
		isPalindrome("mom");
		

	}

	private static void isPalindrome(String name) {
		String rev="";
		char ch[] = name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		
		if(rev.equalsIgnoreCase(name))
			System.out.println(name+" is Palindrome String");
		else
			System.out.println(name+" is not Palindrome String");
	}

	private static void isPalindrome(int num) {
		int temp=num;
		int reverseNum=0;
		while(temp>0) {
			int lastDigit=temp%10;
			reverseNum=reverseNum*10+lastDigit;
			temp/=10;
			
		}
		
		if(num==reverseNum) 
			System.out.println(num+" is Palindrome Number");
		else
			System.out.println(num+" is not Palindrome Number");
		
			
		}
		
	}


