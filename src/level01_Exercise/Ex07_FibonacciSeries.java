package level01_Exercise;

public class Ex07_FibonacciSeries {

	public static void main(String[] args) {
		fibonacciSeries();

	}

	private static void fibonacciSeries() {
		// 1  1  2  3  5  8  
		
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
