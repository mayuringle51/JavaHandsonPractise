package JavaCodingQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		// Reverse a string without using built-in functions.
		// Check if a string is a palindrome.
		// Count the occurrence of each character in a string.
		// Remove duplicate characters from a string.

		reverseString("Make this reverse ");
		isPalindrome("MOMOM");

	}

	private static void isPalindrome(String str) {
		str = str.toLowerCase();
		String rev = reverseString(str);
		if (str.contentEquals(rev))
			System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome String");
		System.out.println(str);
		System.out.println(rev);

	}

	public static String reverseString(String str) {

		str = str.toLowerCase();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
