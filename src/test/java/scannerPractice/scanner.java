package scannerPractice;

import java.util.Scanner;

public class scanner {
	
	public static void singleInput()	{
		System.out.println("Enter the count of total people");
		Scanner s= new Scanner(System.in);
		s.nextInt();
		System.out.println("Enter the organisation name");
		Scanner s1=new Scanner(System.in);
		s1.next();
	}
	public static void multipleInput()	{
		int i;
		for(i=0;i<=2;i++)	{
			System.out.println("Enter your name");
			Scanner s= new Scanner(System.in);
			String name=s.next();
			System.out.println("Enter year of experience");
			Scanner s1= new Scanner(System.in);
			int a=s1.nextInt();
			if(a>=8)
			{
				System.out.println("This candidate is eligible for manager role with experience "+name+" "+a);
				
			}
			else if(a>=3&&a<8)
			{
				System.out.println("This candidate is not eligible for manager role with experience "+name+" "+a);
			}
			else {
				System.out.println("This candidate is a fresher"+name+" "+a);
			}
		}
		
		
	}
	public static void main(String[] args) {
		singleInput();
		multipleInput();
	}
}
