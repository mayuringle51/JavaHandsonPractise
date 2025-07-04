package level01_Exercise;

public class Ex08_ArmstrongNumberCheck {

	public static void main(String[] args) {
		// 153 
		// 1*1*1 + 5*5*5 + 3*3*3 =153
		//1^(1,1)+5^(5,5)+3^(3,3) 
		
		int num=153;
		int length=0;
		int sum=0;
		
		//totalDigits
		int temp=num;
		while(temp>0) {
			length++;
		}

		//find power of number
		temp=num;
		while(temp>0) {
			int lastDigit=temp%10;
			sum=(int) (sum+(Math.pow(lastDigit, length)));
		temp/=10;
		
		}
		
		
		
	}

}
