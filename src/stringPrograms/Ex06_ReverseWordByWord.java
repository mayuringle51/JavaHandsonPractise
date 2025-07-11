package stringPrograms;

public class Ex06_ReverseWordByWord {

	public static void main(String[] args) {
		String input = "Java is powerful";
		String[] words = input.split(" ");
		
		//reverse(words[0]);
		
		for(int i=words.length-1;i>=0;i--) {
			reverse(words[i]);
		}
		
		

	}

	public static void reverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
