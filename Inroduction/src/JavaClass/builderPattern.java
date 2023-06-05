package JavaClass;

public class builderPattern {

	public builderPattern m1()
	{
		System.out.println("M1 is calling--- ");
		return this;
	}
	
	public builderPattern m2()
	{
 		System.out.println("M2 is calling--- ");
 		return this;
	}
	
	public void m3()
	{
		System.out.println("M3 is calling--- ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		builderPattern c1= new builderPattern();
		c1.m1().m2().m3();
	

	}

}
