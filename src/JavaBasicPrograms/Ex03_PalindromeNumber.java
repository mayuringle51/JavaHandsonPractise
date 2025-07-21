package JavaBasicPrograms;

public class Ex03_PalindromeNumber {

	public static void main(String[] args) {

		isPalindrome(12345);
		isPalindrome("MOM");
		

	}

	private static void isPalindrome(String string) {
		String strNum = string;
		String rev = "";

		for (int i = strNum.length() - 1; i >= 0; i--) {
			rev = rev + strNum.charAt(i);
		}

		System.out.println(strNum);
		System.out.println(rev);

		if (strNum.equals(rev))
			System.out.println("This is palindrome");
		else
			System.out.println("This is not palindrome");
		
	}

	private static void isPalindrome(int num) {

		String strNum = Integer.toString(num);
		String rev = "";

		for (int i = strNum.length() - 1; i >= 0; i--) {
			rev = rev + strNum.charAt(i);
		}

		System.out.println(strNum);
		System.out.println(rev);

		if (strNum.equals(rev))
			System.out.println("This is palindrome");
		else
			System.out.println("This is not palindrome");

	}

}
