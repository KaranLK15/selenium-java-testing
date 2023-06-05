package JavaClass;

import java.util.Scanner;

public class scannerclass {
	
public static void main(String[] arg) {
/*	
{

		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println(age);
		sc.close();

	}*/

	Scanner sc=new Scanner(System.in);
	System.out.println("First name");
	String fname=sc.nextLine();
	System.out.println("Last name");
	String lname=sc.nextLine();
	System.out.println("enter your gender M/F");
	String data=sc.nextLine();
	char gender=data.charAt(0);
	System.out.println("Enter your phone no");
	long pno=sc.nextLong();	

	System.out.println(fname);
	System.out.println(lname);	
	System.out.println(gender);
	System.out.println(pno);
}
}
