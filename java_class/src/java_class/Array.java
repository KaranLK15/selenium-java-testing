package java_class;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NEW KEYWORD WAY
		
		
/*		String sid[]=new String[5];
		sid[0]="Karan";
		sid[1]="Vrushali";
		System.out.println("Length is: "+sid.length);
		for(int i=0;i<=5;i++)
		{
			System.out.println(sid[i]);
		}
*/	
		//Array In Literal
/*		int id[]= {10,11,12,13,14,15};
		System.out.println(id[4]);
		System.out.println("lenght is= "+id.length);
*/	
		
		//LITERAL WAY
		Object emp[]= {"Karan", 0.9 , 9033777601L, 158, "Ahmedabad"};
		System.out.println(emp.length);
		System.out.println(emp[2]);
		for (int i=1;i>0;i++)
		{
			System.out.println(emp[i]);
			
		}
			
		}

}


