package java_class;

public class ReversetheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=123, rem, sum=0;
		int temp=num1;
		
		while(num1>0)
		{
			rem=num1%10;
			num1=num1/10;
			sum=sum*10+rem;
		}
		
		System.out.println("Reverse number of  "+temp+ "is:" +sum);
		
	}

}
