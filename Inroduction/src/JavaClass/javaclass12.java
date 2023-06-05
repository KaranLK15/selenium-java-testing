package JavaClass;
	
public class javaclass12
	{
	public void show() 
	{
		System.out.println("this is instance");
	}
	
	public static void display()
	{
		System.out.println("This is static method" );
	}
	
	public static void main(String[] args) 
	{
		javaclass12 j1= new javaclass12();
		j1.show();
		javaclass12.display();
	}
}