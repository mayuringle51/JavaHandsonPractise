package stringPrograms;

public class Ex01_countChar {

	public static void main(String[] args) {
		String string = "The best of both worlds";
		char[] ch = string.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
				count++;

		}

		System.out.println("Total number of characters in a string: " + count);

	}

}
