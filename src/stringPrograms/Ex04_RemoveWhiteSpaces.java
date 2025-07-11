package stringPrograms;

public class Ex04_RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str1 = "   Remove white spaces  ";
		
		System.out.println(str1.trim());
		System.out.println(str1.stripLeading());
		System.out.println(str1.stripTrailing());
		System.out.println(str1.replaceAll("\\s+", ""));
		System.out.println(str1.replaceAll("R", "Z"));
	}

}
