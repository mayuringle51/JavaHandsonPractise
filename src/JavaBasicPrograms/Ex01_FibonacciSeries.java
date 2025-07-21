package JavaBasicPrograms;

public class Ex01_FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21
		
		int a=0;
		int b=1;
		
		for(int i=0;i<15;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
